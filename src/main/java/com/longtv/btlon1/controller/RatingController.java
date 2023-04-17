package com.longtv.btlon1.controller;

import com.longtv.btlon1.entity.ResponseDTO;
import com.longtv.btlon1.entity.rating.Rating;
import com.longtv.btlon1.entity.user.User;
import com.longtv.btlon1.service.rating.RatingService;
import com.longtv.btlon1.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/api/rating")
public class RatingController {

    @Autowired
    RatingService service;
    @Autowired
    UserService userService;

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO<List<Rating>>> getRatingByBoodId(@PathVariable("id") String id) {
        return ResponseEntity.ok(new ResponseDTO<>(service.getRatingByBookId(id), "200", ""));
    }

    @PostMapping("/post")
    public ResponseEntity<ResponseDTO<?>> postRating(@RequestBody Rating rating) {
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        System.out.println(principal.toString());
        User user = userService.getOneByEmail(principal.toString());
        rating.setUser(user);
        rating.setLocalDate(LocalDate.now());
        service.saveRating(rating);


        return ResponseEntity.ok(new ResponseDTO<>(rating, "200", ""));
    }

}
