package com.example.orderservice.kafka;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class PaymentConsumer {

    @KafkaListener(topics = "payment-topic", groupId = "order-group")
    public void consumePayment(String message) {

        System.out.println("Payment Event Received: " + message);

    }
}
