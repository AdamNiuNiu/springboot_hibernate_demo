package com.example.springboot_hibernate_demo.web;

import com.example.springboot_hibernate_demo.entity.User;
import com.example.springboot_hibernate_demo.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("findAllUser")
    public String test1() {
        List<User> userAll = userService.findUserAll();
        if(userAll!=null && userAll.size()>0) {
            for (User user : userAll) {
                System.out.println("==================user:"+user.toString());
                log.info("*************user:"+user.toString());
            }
        }
        return "11111111";
    }
}
