package com.example.kafkapractice.controller;

import com.example.kafkapractice.entity.Order;
import com.example.kafkapractice.service.OrderService;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
@Data
public class OrderController {

    private final OrderService producer;

    @PostMapping
    public String sendOrder(@RequestBody Order order) {
        producer.sendOrder(order);
        return "Order sent to Kafka!";
    }
}