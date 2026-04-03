package com.example.kafkapractice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "istifadeci_hadiseleri", groupId = "my-group-id")
    public void consume(String message) {
        System.out.println("Yeni mesaj alındı: " + message);
    }
}