# Spring Boot Microservices with Kafka

## 📌 Project Overview
This project demonstrates an **Event-Driven Microservices Architecture** using **Spring Boot** and **Apache Kafka**.

The system consists of multiple microservices that communicate asynchronously using Kafka message broker. This helps in achieving loose coupling between services and improves scalability.

Example Flow:  
Order Service → sends message → Kafka → Payment Service consumes message → processes payment → displays success message.

---

## 🏗️ Microservices in Project

### 1. Eureka Server
- Service Registry for microservices
- All services register themselves here

### 2. Order Service
- Accepts order details using REST API
- Publishes order event to Kafka topic

### 3. Payment Service
- Consumes order message from Kafka
- Processes payment
- Prints payment success message

### 4. Apache Kafka
- Message broker used for communication between services

### 5. Zookeeper
- Required for managing Kafka broker

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Web
- Spring Kafka
- Eureka Server
- Apache Kafka
- Zookeeper
- Maven
- REST API

---

## ⚙️ Architecture Flow

1. Client sends request to Order Service API
2. Order Service publishes message to Kafka topic
3. Kafka stores message
4. Payment Service consumes message from Kafka
5. Payment Service processes payment
6. Payment success message is displayed in console

---

## 📂 Project Structure
