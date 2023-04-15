package com.longtv.btlon1.service.user;

import com.longtv.btlon1.entity.user.User;

public interface UserService {
    boolean save(User user);
    User getOneByEmailAndPass(User user);

    User getOneByEmail(String email);

    User updateUser(User user);
}
