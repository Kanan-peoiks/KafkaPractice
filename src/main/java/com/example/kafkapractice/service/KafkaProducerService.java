package com.example.kafkapractice.service;


import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducerService {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private final String TOPIC = "istifadeci_hadiseleri";

    public KafkaProducerService(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message) {
        System.out.println("Mesaj göndərilir: " + message);
        this.kafkaTemplate.send(TOPIC, message);
    }
}