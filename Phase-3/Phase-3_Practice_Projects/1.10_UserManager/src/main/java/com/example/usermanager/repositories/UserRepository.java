package com.example.usermanager.repositories;

import org.springframework.data.repository.CrudRepository;

import com.example.usermanager.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {

    public User findByName(String name);
}