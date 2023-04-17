package com.longtv.btlon1.service.user;

import com.longtv.btlon1.entity.user.Role;
import com.longtv.btlon1.entity.user.User;
import com.longtv.btlon1.repo.user.RoleRepo;
import com.longtv.btlon1.repo.user.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoleServiceImpl implements RoleService{

    @Autowired
    RoleRepo roleRepo;
    @Autowired
    UserRepo userRepo;

    @Override
    public Role saveRole(Role role) {
        roleRepo.save(role);
        return role;
    }

    @Override
    public void addRoleToUser(String phoneNumber, String roleName) {
        User user = userRepo.findByEmail(phoneNumber);
        Role role = roleRepo.findByName(roleName);
        List<Role> roles = (List<Role>) user.getRoles();
        roles.add(role);
        user.setRoles(roles);
        userRepo.save(user);
    }

    @Override
    public Role findByName(String name) {
        return roleRepo.findByName(name);
    }

    @Override
    public List<Role> getAll() {
        return roleRepo.findAll();
    }
}
