# HiringX Backend

![GitHub repo](https://img.shields.io/github/repo-size/vedkap26/HiringX-Backend)
![Contributors](https://img.shields.io/github/contributors/vedkap26/HiringX-Backend)
![License](https://img.shields.io/github/license/vedkap26/HiringX-Backend)

HiringX is a modular recruitment platform built using a microservices architecture to streamline and optimize hiring processes for companies and job seekers. This repository contains the backend services developed using **Spring Boot**, **Spring Cloud**, and **Spring Profiles**.

---

## 🏗️ Architecture Overview

This project follows the **Microservices Architecture**, where each service is independent, scalable, and communicates using REST APIs. The services are structured with different Spring Profiles to isolate environments (e.g., dev, prod).

### ✅ Services Overview

| Service Name       | Description                            | Port  |
|--------------------|----------------------------------------|--------|
| `user-service`     | Handles user registration & auth       | `8081` |
| `job-service`      | Manages job listings and metadata      | `8082` |
| `application-service` | Manages applications & statuses    | `8083` |
| `gateway-service`  | API Gateway for routing                | `8080` |
| `eureka-server`    | Service discovery with Netflix Eureka  | `8761` |
| `config-server`    | Centralized configuration              | `8888` |

---

### 🔧 Tech Stack

- **Java 17**
- **Spring Boot**
- **Spring Cloud (Eureka, Config, Gateway)**
- **Spring Data JPA**
- **MySQL / PostgreSQL**
- **Spring Security + JWT**
- **Lombok**
- **Docker** (for containerization)
- **Swagger/OpenAPI** for API documentation

---

## 📁 Project Structure

```bash
HiringX-Backend/
│
├── config-server/               # Centralized config
├── eureka-server/               # Service registry
├── gateway-service/             # API Gateway
├── user-service/                # User management
├── job-service/                 # Job-related services
├── application-service/         # Application tracking
└── README.md
🚀 Getting Started
1. Clone the Repository
bash
Copy
Edit
git clone https://github.com/vedkap26/HiringX-Backend.git
cd HiringX-Backend
2. Setup Configuration
Make sure to create config files for each service in your Spring Cloud Config repository or application.yml files using dev or prod Spring profiles.

Example: application.yml for user-service

yaml
Copy
Edit
server:
  port: 8081

spring:
  application:
    name: user-service
  datasource:
    url: jdbc:mysql://localhost:3306/userdb
    username: root
    password: root
3. Start All Services
Start the services in the following order (either via IDE or terminal):

bash
Copy
Edit
# Start Config Server
cd config-server && ./mvnw spring-boot:run

# Start Eureka Server
cd ../eureka-server && ./mvnw spring-boot:run

# Start Gateway
cd ../gateway-service && ./mvnw spring-boot:run

# Start all microservices
cd ../user-service && ./mvnw spring-boot:run
cd ../job-service && ./mvnw spring-boot:run
cd ../application-service && ./mvnw spring-boot:run
📫 API Endpoints (via Gateway)
Endpoint	Description
POST /api/users/register	Register a new user
POST /api/users/login	Authenticate user
GET /api/jobs	Fetch all jobs
POST /api/apply	Submit job application

Replace /api/ with your configured gateway route prefixes.

🧪 Testing
Use Postman or Swagger UI to test APIs.

Swagger URLs (after running services):

http://localhost:8081/swagger-ui.html – user-service

http://localhost:8082/swagger-ui.html – job-service

http://localhost:8083/swagger-ui.html – application-service

🐳 Docker Setup (Optional)
You can use Docker for containerizing services.

Example Dockerfile for user-service:

dockerfile
Copy
Edit
FROM openjdk:17
ADD target/user-service.jar user-service.jar
EXPOSE 8081
ENTRYPOINT ["java", "-jar", "user-service.jar"]
You can also use Docker Compose to orchestrate all services.

🤝 Contributing
Contributions are welcome! Please fork the repo and submit a pull request.

📄 License
This project is licensed under the MIT License - see the LICENSE file for details.

📞 Contact
For questions or suggestions, feel free to connect:

GitHub: vedkap26

Email: vedant@example.com (replace with your real email)

yaml
Copy
Edit

---

Would you like a **microservice architecture diagram** (PNG) added to this as an image hosted on GitHub or elsewhere? I can help generate it next.








Ask ChatGPT
