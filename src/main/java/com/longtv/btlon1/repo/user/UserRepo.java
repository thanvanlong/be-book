package com.longtv.btlon1.repo.user;

import com.longtv.btlon1.entity.user.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepo extends MongoRepository<User, String> {
    User findByEmailAndPassword(String email, String pass);

    User findByEmail(String email);
}
