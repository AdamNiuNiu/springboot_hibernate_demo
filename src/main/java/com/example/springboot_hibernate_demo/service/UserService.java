package com.example.springboot_hibernate_demo.service;

import com.example.springboot_hibernate_demo.entity.User;

import java.util.List;

public interface UserService {

//    List<User> findUserAll();

    List<User> findUserAllSession();

    void saveUser(User user);
}
