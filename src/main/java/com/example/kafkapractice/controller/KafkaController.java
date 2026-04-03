package com.example.kafkapractice.controller;


import com.example.kafkapractice.service.KafkaProducerService;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/kafka")
@Data
public class KafkaController {

    private final KafkaProducerService producerService;


    @PostMapping("/publish")
    public String sendToKafka(@RequestParam("message") String message) {
        producerService.sendMessage(message);
        return "Mesaj Kafka-ya uğurla göndərildi!";
    }
}