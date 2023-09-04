package com.study.eureka_consumer.controller;

import com.study.eureka_consumer.pojo.User;
import com.study.eureka_consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/findUserById/{id}")
    public User findUserById(@PathVariable("id") int id){
        return userService.findUserById(id);
    }
}
