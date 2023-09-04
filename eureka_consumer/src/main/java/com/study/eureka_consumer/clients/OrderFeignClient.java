package com.study.eureka_consumer.clients;

import com.study.eureka_consumer.pojo.Ordertb;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("eureka-provide1")
public interface OrderFeignClient {

    @GetMapping("/order/findOrderById/{id}")
    Ordertb findById(@PathVariable("id") int id);
}
