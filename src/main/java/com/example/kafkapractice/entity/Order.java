package com.example.kafkapractice.entity;

import lombok.Data;

@Data
public class Order {

    private String orderId;
    private String product;
    private int quantity;

}
