package com.study.eureka_consumer.service.impl;

import com.study.eureka_consumer.clients.OrderFeignClient;
import com.study.eureka_consumer.mapper.UserMapper;
import com.study.eureka_consumer.pojo.Ordertb;
import com.study.eureka_consumer.pojo.User;
import com.study.eureka_consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Autowired
    private OrderFeignClient orderFeignClient;

    @Override
    public User findUserById(int id) {
        User user = userMapper.findUserById(id);
//        String url = "http://demo-eureka-consumer3/user/findUserById/"+ordertb.getUserId();
//        User user =restTemplate.getForObject(url,User.class);
        Ordertb ordertb = orderFeignClient.findById(user.getOrderId());
        user.setOrdertb(ordertb);
        System.out.println(ordertb);
        return user;
    }


}
