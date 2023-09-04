package com.study.eureka_provider.controller;
import com.study.eureka_provider.pojo.Ordertb;
import com.study.eureka_provider.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    @GetMapping("/findOrderById/{id}")
    public Ordertb findOrderById(@PathVariable("id") int id){
        return orderService.findOrderAllById(id);
    }
}
