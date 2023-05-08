package com.david.backend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.david.backend.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {
    
}
