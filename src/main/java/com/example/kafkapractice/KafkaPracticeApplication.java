package com.example.kafkapractice;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class KafkaPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaPracticeApplication.class, args);

    }

    @Bean
    public NewTopic istifadeciHadiseleriTopic() {
        return new NewTopic("istifadeci_hadiseleri", 1, (short) 1);
    }

}
