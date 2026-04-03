package com.example.paymentservice.service;

import com.example.paymentservice.dto.PaymentRequest;
import org.springframework.stereotype.Service;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.beans.factory.annotation.Autowired;
@Service
public class PaymentService {
    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;
    public void makePayment(PaymentRequest paymentRequest) {

        System.out.println("Payment done for order: " + paymentRequest.getOrderId());

        kafkaTemplate.send("payment-topic",
                "Payment completed for order " + paymentRequest.getOrderId());
    }
}