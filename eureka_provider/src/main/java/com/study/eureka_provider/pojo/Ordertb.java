package com.study.eureka_provider.pojo;

import lombok.Data;

@Data
public class Ordertb {
    private int id;
    private String orderName;
    private int num;
    private int userId;
    private User user;
}
