package com.study.eureka_provider.clients;

import com.study.eureka_provider.pojo.Ordertb;
import com.study.eureka_provider.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("demo-eureka-consumer3")
public interface UserFeignClient {

    @GetMapping("/user/findUserById/{id}")
    User findById(@PathVariable("id") int id);
}
