# Lost and Found Backend

This is the backend API for the Lost and Found Application for an Educational Institute. It is built with **Spring Boot (Java 21)**, **Spring Security**, **JWT Authentication**, and **MySQL**.

## Features

- User registration and login with JWT-based authentication
- Role-based access control (USER and ADMIN roles)
- CRUD operations for Items and Requests
- Request approval workflow
- Secure endpoints with JWT token validation
- Logging and error handling

## Technologies Used

- Java 21
- Spring Boot
- Spring Security
- JWT (JSON Web Tokens)
- MySQL
- Hibernate / JPA

## Getting Started

### Prerequisites

- Java 21 JDK
- Maven
- MySQL server
- An IDE (e.g., IntelliJ IDEA, Eclipse)

### Setup

1. Clone the repository:

   git clone https://github.com/Navindi-Thisara/lostFound-backend.git

2. Navigate to the project directory:

   cd lostFound-backend

3. Configure the database connection in src/main/resources/application.properties (already configured for your local MySQL):

   spring.datasource.url=jdbc:mysql://localhost:3306/lost_found_db?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
   spring.datasource.username=root
   spring.datasource.password=YOUR_PASSWORD_HERE


4. Set your JWT secret environment variable:

   export JWT_SECRET=your_base64_encoded_secret_key

5. Build and run the application:

   mvn clean install
   mvn spring-boot:run
   The API will be available at http://localhost:8080/lostfound/api/

## API Endpoints

### Authentication

- POST /lostfound/api/auth/register - Register a new user

- POST /lostfound/api/auth/login - Login and receive JWT token

### Items

- GET /lostfound/api/items - Get all items

- POST /lostfound/api/items - Create a new item

- GET /lostfound/api/items/{id} - Get item by ID

- PUT /lostfound/api/items/{id} - Update an item

- DELETE /lostfound/api/items/{id} - Delete an item

### Requests

- GET /lostfound/api/requests - Get all requests

- POST /lostfound/api/requests - Submit a new request

- GET /lostfound/api/requests/{id} - Get request by ID

## Author

- J.L.N. Thisara

- Email: your-navindithisara214@gmail.com
