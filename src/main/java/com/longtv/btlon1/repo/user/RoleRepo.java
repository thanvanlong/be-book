package com.longtv.btlon1.repo.user;

import com.longtv.btlon1.entity.user.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepo extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
