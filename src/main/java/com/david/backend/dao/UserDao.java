package com.david.backend.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.david.backend.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {

}
