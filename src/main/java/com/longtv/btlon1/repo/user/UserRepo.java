package com.longtv.btlon1.repo.user;

import com.longtv.btlon1.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, Long> {
    User findByEmailAndPassword(String email, String pass);

    User findByEmail(String email);
}
