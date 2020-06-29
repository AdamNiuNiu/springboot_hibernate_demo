package com.example.springboot_hibernate_demo;

import com.example.springboot_hibernate_demo.entity.User;
import com.example.springboot_hibernate_demo.service.impl.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class SpringbootHibernateDemoApplicationTests {

    @Autowired
    private UserServiceImpl userService;

    @Test
    void contextLoads() {

        List<User> userAll = userService.findUserAll();
        if(userAll!=null && userAll.size()>0) {
            for (User user : userAll) {
                System.out.println("==================user:"+user.toString());
            }
        }
    }

}
