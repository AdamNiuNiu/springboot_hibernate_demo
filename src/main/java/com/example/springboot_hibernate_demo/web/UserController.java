package com.example.springboot_hibernate_demo.web;

import com.example.springboot_hibernate_demo.entity.User;
import com.example.springboot_hibernate_demo.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping(value = "findAllUser",method = RequestMethod.POST)
    public String test1() {
//        List<User> userAll = userService.findUserAll();
        List<User> userAll = userService.findUserAllSession();
        if(userAll!=null && userAll.size()>0) {
            for (User user : userAll) {
                System.out.println("==================user:"+user.toString());
                log.info("*************user:"+user.toString());
            }
        }
        return "11111111";
    }


    @RequestMapping(value = "saveUser",method = RequestMethod.POST)
    public String testSaveUser() {

        User user = new User();
        user.setName("测试姓名");
        user.setPassword("测试密码");
        user.setUserName("随便");
        userService.saveUser(user);
        return "保存成功！";
    }
}
