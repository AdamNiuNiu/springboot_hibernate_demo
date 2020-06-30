package com.example.springboot_hibernate_demo.service.impl;

import com.example.springboot_hibernate_demo.dao.UserDao_session;
import com.example.springboot_hibernate_demo.entity.User;
import com.example.springboot_hibernate_demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

//    @Autowired
//    private UserDao userDao;

    @Autowired
    private UserDao_session userDao_session;

//    @Override
//    public List<User> findUserAll() {
//        return userDao.findUserAll();
//    }

    @Override
    public List<User> findUserAllSession() {
        return userDao_session.findUserAll();
    }

    @Override
    public void saveUser(User user) {
        userDao_session.saveUser(user);
    }
}
