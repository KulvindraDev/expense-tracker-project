package com.expense.userservice.consumer;

import com.expense.userservice.repository.UserRepository;
import org.springframework.kafka.annotation.KafkaListener;

public class AuthServiceConsumer {
    private UserRepository userRepository;

    AuthServiceConsumer(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @KafkaListener (topics = "${spring.kafka.topic.name}", groupId = "${userinfo-consumer-group}")
    public void listen (Object eventData) {
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
