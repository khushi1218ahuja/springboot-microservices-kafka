package com.example.orderservice.service;

import com.example.orderservice.entity.Order;
import com.example.orderservice.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private KafkaProducerService kafkaProducerService;

    public Order createOrder(Order order) {

        order.setStatus("CREATED");

        Order savedOrder = orderRepository.save(order);

        // send event to Kafka
        kafkaProducerService.sendOrderEvent(
                "Order Created with ID: " + savedOrder.getId()
        );

        return savedOrder;
    }
}