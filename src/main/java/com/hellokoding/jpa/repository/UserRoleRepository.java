package com.hellokoding.jpa.repository;


import com.hellokoding.jpa.model.Role;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRoleRepository extends JpaRepository<Role, Integer>{
}