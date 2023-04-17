package com.longtv.btlon1.service.user;

//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
import com.longtv.btlon1.entity.user.Role;
import com.longtv.btlon1.entity.user.User;
import com.longtv.btlon1.repo.user.UserRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    UserRepo userRepo;
    private final PasswordEncoder passwordEncoder;
    @Override
    public boolean save(User user) {
        try {
            user.setPassword(passwordEncoder.encode(user.getPassword()));
            userRepo.save(user);
        } catch (Exception e) {
            return false;
        }

        return true;
    }

    @Override
    public User getOneByEmailAndPass(User user) {
        return userRepo.findByEmailAndPassword(user.getEmail(), user.getPassword());
    }

    @Override
    public User getOneByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    @Override
    public User updateUser(User user) {
        User u = userRepo.findByEmail(user.getEmail());
        if (u == null) {
            return null;
        } else {
            u.setAddress(user.getAddress() != null ? user.getAddress() : u.getAddress());
            if (user.getPassword() != null) {
                u.setPassword(passwordEncoder.encode(user.getPassword()));
            }
            if (user.getPhoneNumber() != null) {
                u.setPhoneNumber(user.getPhoneNumber());
            }
            if (user.getUsername() != null) {
                u.setName(user.getName());
            }
            try {
                userRepo.save(u);
                return u;
            } catch (Exception e) {
                return null;
            }
        }
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepo.findByEmail(username);
        System.out.println("longtv: mail " + username);
        if(user == null){
            throw new UsernameNotFoundException("User not found in the database");
        }
        return user;
    }
}
