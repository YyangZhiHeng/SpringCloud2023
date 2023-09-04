package com.study.eureka_provider.service.impl;

import com.study.eureka_provider.clients.UserFeignClient;
import com.study.eureka_provider.mapper.OrderMapper;
import com.study.eureka_provider.pojo.Ordertb;
import com.study.eureka_provider.pojo.User;
import com.study.eureka_provider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderMapper orderMapper;
//    @Autowired
//    private RestTemplate restTemplate;
//    @Autowired
//    private UserFeignClient userFeignClient;

    public Ordertb findOrderAllById(int id) {
//        Ordertb ordertb = orderMapper.findOrderAllById(id);
//        String url = "http://demo-eureka-consumer3/user/findUserById/"+ordertb.getUserId();
//        User user =restTemplate.getForObject(url,User.class);
//        User user = userFeignClient.findById(ordertb.getUserId());
//        ordertb.setUser(user);
        System.out.println( orderMapper.findOrderAllById(id));
        return  orderMapper.findOrderAllById(id);
    }
//    @Override
//    public Ordertb findOrderAllById(int id) {
//        Ordertb ordertb = orderMapper.findOrderAllById(id);
//        String url = "http://demo-eureka-consumer3/user/findUserById/"+ordertb.getUserId();
//        User user =restTemplate.getForObject(url,User.class);
//        ordertb.setUser(user);
//        System.out.println(ordertb);
//        return ordertb;
//    }
}
