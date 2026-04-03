package com.example.paymentservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    @KafkaListener(topics = "order-topic", groupId = "payment-group")
    public void consume(String message) {

        System.out.println("Payment Service received: " + message);

        System.out.println("Payment successful!");
    }
}