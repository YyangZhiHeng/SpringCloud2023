package com.study.eureka_provider.pojo;

import lombok.Data;

@Data
public class User {
    private int id;
    private String username;
    private String address;
    private int orderId;
}