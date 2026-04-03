package com.example.kafkapractice.service;

import com.example.kafkapractice.entity.Order;
import lombok.Data;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@Data
public class OrderService {

    private final KafkaTemplate<String, Order> kafkaTemplate;



    public void sendOrder(Order order) {
        kafkaTemplate.send("order-topic", order);
    }
}