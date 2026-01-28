package com.ecommerce.project.database.dao;

import com.ecommerce.project.database.dto.AppRole;
import com.ecommerce.project.database.dto.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);
}
