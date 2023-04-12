package com.longtv.btlon1.controller;


import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.longtv.btlon1.entity.ResponseDTO;
import com.longtv.btlon1.entity.user.Role;
import com.longtv.btlon1.entity.user.User;
import com.longtv.btlon1.service.user.RoleService;
import com.longtv.btlon1.service.user.UserService;
import com.longtv.btlon1.utils.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Arrays.stream;
import static org.springframework.util.MimeTypeUtils.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class UserController {

    @Autowired
    UserService service;
    @Autowired
    RoleService roleService;
    @PostMapping("/save")
    public ResponseEntity<ResponseDTO<?>> saveUser(@RequestBody User user) {

        if (!StringUtils.validate(user.getEmail())) {
            return ResponseEntity.ok(new ResponseDTO<>("Địa chỉ email không hợp lệ", "404", "Failed"));
        }

        if(service.getOneByEmail(user.getEmail()) != null) {
            return ResponseEntity.ok(new ResponseDTO<>("Email này đã được sử dụng", "400", "Failed"));
        }

        if (user.getRoles() == null || user.getRoles().size() == 0) {
            List<Role> roles = new ArrayList<>();
            Role role = roleService.findByName("ROLE_USER");
            roles.add(role);
            user.setRoles(roles);
        }
        boolean rs = service.save(user);

        if (!rs) {
            return ResponseEntity.ok(new ResponseDTO<>("Đăng kí không thành công", "400", "Failed"));
        }

        return ResponseEntity.ok(new ResponseDTO<User>(user, "200", "Success"));
    }

    @PostMapping("/login")
    public ResponseEntity<ResponseDTO<?>> login(@RequestBody User user) {
        User rs = service.getOneByEmailAndPass(user);
//        String pattern = "^(.+)@(\\\\S+)$";
//
//        if (!user.getEmail().matches(pattern)) {
//            return ResponseEntity.ok(new ResponseDTO<>("Địa chỉ email không hợp lệ", "404", "Failed"));
//        }

        if (!StringUtils.validate(user.getEmail())) {
            return ResponseEntity.ok(new ResponseDTO<>("Địa chỉ email không hợp lệ", "404", "Failed"));
        }


        if (rs == null) {
            return ResponseEntity.ok(new ResponseDTO<>("Không tìm thấy tài khoản này", "404", "Failed"));
        }

        return ResponseEntity.ok(new ResponseDTO<>(rs, "200", "Success"));
    }


    @PostMapping("/refresh")
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {
        try {
            stream(request.getCookies()).forEach(cookie -> System.out.println(cookie.getName()+": " + cookie.getValue()));
            System.out.println(request.getRequestURI());
            List<Cookie> token =  stream(request.getCookies()).filter(cookie -> cookie.getName().equals("refresh_token")).collect(Collectors.toList());
            String refresh_token = token.get(0).getValue();
            Algorithm algorithm = Algorithm.HMAC256("secret".getBytes(StandardCharsets.UTF_8));
            JWTVerifier jwtVerifier = JWT.require(algorithm).build();
            DecodedJWT decodedJWT = jwtVerifier.verify(refresh_token);
            String phonenNumber = decodedJWT.getSubject();
            User user = service.getOneByEmail(phonenNumber);
            String access_token = JWT.create()
                    .withSubject(user.getEmail() + "-" + user.getUsername() + "-" + user.getFirstName())
                    .withExpiresAt(new Date(System.currentTimeMillis() + 10 * 1000 * 1000))
                    .withIssuer(request.getRequestURI())
                    .withClaim("roles", user.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
                    .sign(algorithm);
            Map<String, String> tokens = new HashMap<>();
            tokens.put("access_token", access_token);
            response.setContentType(APPLICATION_JSON_VALUE);
            new ObjectMapper().writeValue(response.getOutputStream(), tokens);

        }catch (Exception e){
            response.setHeader("error", e.getMessage());
            Map<String, String> tokens = new HashMap<>();
            tokens.put("error_message", (e.getMessage() + "cookies"));
            response.setStatus(400);
            response.setContentType(APPLICATION_JSON_VALUE);
            new ObjectMapper().writeValue(response.getOutputStream(), tokens);
        }
    }




}
