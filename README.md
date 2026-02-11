# Ecommerce Microservices Architecture 

This project is a high-scalability E-commerce system built with a **Microservices Architecture** and **Event-Driven Design**, following industry standards used by companies like Netflix and Uber.

The main goal of this repository is to demonstrate the implementation of distributed systems patterns, resilience, and asynchronous communication.

## Tech Stack

*   **Language:** Java 17
*   **Framework:** Spring Boot 4.0.2
*   **Messaging:** Apache Kafka / RabbitMQ (Event Bus)
*   **Database:** PostgreSQL (Production) / H2 (Development)
*   **Service Discovery:** Netflix Eureka
*   **API Gateway:** Spring Cloud Gateway
*   **Resilience:** Resilience4j (Circuit Breaker, Retry, Rate Limiter)
*   **Containerization:** Docker & Docker Compose
*   **Orchestration:** Kubernetes (K8s)
*   **Observability:** Zipkin & Spring Cloud Sleuth (Distributed Tracing)

## Key Patterns Implemented

- **Saga Pattern:** Managing distributed transactions across multiple services to ensure data consistency.
- **CQRS (Command Query Responsibility Segregation):** Separating read and write operations for optimized performance.
- **Service Discovery & Config Server:** Centralized management of microservices and configurations.
- **Circuit Breaker:** Preventing cascade failures using Resilience4j.
- **Database per Service:** Each microservice manages its own persistent storage to ensure loose coupling.

## How to Run

1. **Clone the repository:**
   ```bash
   git clone https://github.com/Muriel627/EcommerceMicroservices.git