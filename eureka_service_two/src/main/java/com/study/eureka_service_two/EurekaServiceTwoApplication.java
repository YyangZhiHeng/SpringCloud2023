package com.study.eureka_service_two;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaServiceTwoApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceTwoApplication.class,args);
    }
}
