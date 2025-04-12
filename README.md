# springboot-loans-api

## Overview
A Spring Boot-based REST API for managing loans. The API allows users to create, retrieve, and delete loan records, as well as associate loans with persons.

## Features
- **Loan Management**: Create, retrieve, and delete loans.
- **Person Association**: Associate loans with persons using their IDs.
- **Model Mapping**: Uses ModelMapper for DTO-to-entity and entity-to-DTO conversions.
- **Error Handling**: Custom exception handling for missing loans or persons.

## Technologies Used
- **Java**: Core programming language.
- **Spring Boot**: Framework for building the REST API.
- **Maven**: Dependency management and build tool.
- **ModelMapper**: For object mapping between DTOs and entities.
- **Lombok**: To reduce boilerplate code (e.g., getters, setters).
- **MongoDB**

## Endpoints
### Loan Endpoints
- **GET /api/v1/loans/get/{id}**: Retrieve a loan by its ID.
- **POST /api/v1/loans/create**: Create a new loan.
- **DELETE /api/v1/loans/delete/{id}**: Delete a loan by its ID.

## Project Structure
- **Controller**: Handles HTTP requests and responses.
- **Service**: Contains business logic for loan operations.
- **Repository**: Interfaces for database access.
- **DTOs**: Data Transfer Objects for request and response payloads.
- **Collections**: Represent database collections.

## How to Run
1. Clone the repository.
2. Navigate to the project directory.
3. Run the application using:
   ```bash
   mvn spring-boot:run
   ```
4. Access the API at `http://localhost:8080/api/v1/loans`.
5. Use tools like Postman or curl to test the endpoints.
6. Ensure MongoDB is running and configured correctly in `application.properties`.
7. 