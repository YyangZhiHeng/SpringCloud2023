package com.study.eureka_consumer.pojo;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String address;
    private int orderId;
    private Ordertb ordertb;
}
