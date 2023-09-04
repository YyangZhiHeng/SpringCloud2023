package com.study.eureka_consumer.service;


import com.study.eureka_consumer.pojo.User;

public interface UserService {
    public User findUserById(int id);
}
