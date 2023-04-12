package com.longtv.btlon1.service.user;

import com.longtv.btlon1.entity.user.Role;

public interface RoleService {
    Role saveRole(Role role);
    void addRoleToUser(String phoneNumber, String roleName);

    Role findByName(String name);
}
