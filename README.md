# Spring Boot Microservices with Kafka

## 📌 Project Overview
This project demonstrates a **complete Microservices Architecture** using **Spring Boot**, **Apache Kafka**, and **Eureka Service Registry**.

Multiple independent services communicate asynchronously using Kafka and are routed through an API Gateway.

---

## 🏗️ Microservices in Project

### 🔹 Service Registry (Eureka Server)
- Registers all microservices
- Enables service discovery

### 🔹 API Gateway
- Single entry point for all client requests
- Routes requests to respective services

### 🔹 Order Service
- Creates orders
- Publishes order events to Kafka topic

### 🔹 Payment Service
- Consumes order events from Kafka
- Processes payment
- Logs payment success

### 🔹 Cart Service
- Manages user cart
- Add/remove items

### 🔹 Product Service
- Handles product-related operations
- Stores product details

### 🔹 User Service
- Manages user data and operations

---

## 🛠️ Technologies Used

- Java
- Spring Boot
- Spring Cloud
- Spring Web
- Spring Kafka
- Eureka Server (Service Discovery)
- API Gateway
- Apache Kafka
- Zookeeper
- Maven

---

## ⚙️ Architecture Flow

1. Client sends request via API Gateway
2. Gateway routes request to respective microservice
3. Order Service publishes event to Kafka
4. Kafka broker stores message
5. Payment Service consumes message from Kafka
6. Payment gets processed
7. Response/log is generated

---

## 📂 Project Structure

```
springboot-microservices-kafka
│
├── api-gateway
├── cart-service
├── order-service
├── payment-service
├── product-service
├── service-registry
├── user-service
│
├── pom.xml
└── README.md
```

---

## 🚀 How to Run the Project

### Step 1: Start Zookeeper

**Windows:**
```bash
bin\windows\zookeeper-server-start.bat config\zookeeper.properties
```

**Mac/Linux:**
```bash
bin/zookeeper-server-start.sh config/zookeeper.properties
```

---

### Step 2: Start Kafka Server

**Windows:**
```bash
bin\windows\kafka-server-start.bat config\server.properties
```

**Mac/Linux:**
```bash
bin/kafka-server-start.sh config/server.properties
```

---

### Step 3: Run Service Registry

Run:
```
ServiceRegistryApplication.java
```

Open:
```
http://localhost:8761
```

---

### Step 4: Run Microservices

Run all services one by one:

- API Gateway
- Order Service
- Payment Service
- Cart Service
- Product Service
- User Service

---

## 📬 Sample API

**Create Order:**
```
POST http://localhost:8081/order
```

**Sample Request:**
```json
{
  "orderId": 101,
  "amount": 500,
  "productName": "Mobile"
}
```

---

## 📊 Kafka Details

- **Topic Name:** `order-topic`
- **Producer:** Order Service
- **Consumer:** Payment Service

**Example Log:**
```
Payment Service received: Order Created
Payment successful!
```

---

## 🎯 Key Features

- Microservices Architecture
- API Gateway Routing
- Service Discovery using Eureka
- Event-driven communication using Kafka
- Loose coupling between services
- Scalable and maintainable system

---

## 👩‍💻 Author

Khushi Ahuja

---

## 🔮 Future Improvements

- Add Database (MySQL/PostgreSQL)
- Add Authentication (JWT)
- Dockerize services
- Add centralized logging
- Add monitoring (Prometheus, Grafana)
- Implement Circuit Breaker (Resilience4j)

---
