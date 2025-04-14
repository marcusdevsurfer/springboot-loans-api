# springboot-loans-api

## Overview
A Spring Boot-based REST API for managing loans and persons. The API allows users to create, retrieve, and delete loan records, as well as manage persons and associate loans with them.

## Features
- **Loan Management**: Create, retrieve, and delete loans.
- **Person Management**: Create, retrieve, and delete persons.
- **Person Association**: Associate loans with persons using their IDs.
- **Model Mapping**: Uses ModelMapper for DTO-to-entity and entity-to-DTO conversions.
- **Error Handling**: Custom exception handling for missing loans or persons.
- **API Documentation**: Integrated Swagger UI for API documentation and testing.

## Technologies Used
- **Java**: Core programming language.
- **Spring Boot**: Framework for building the REST API.
- **Maven**: Dependency management and build tool.
- **ModelMapper**: For object mapping between DTOs and entities.
- **Lombok**: To reduce boilerplate code (e.g., getters, setters).
- **MongoDB**: NoSQL database for storing loan and person data.
- **Swagger**: For API documentation and testing.

## Endpoints

### Loan Endpoints
- **GET /api/v1/loans/get/{id}**: Retrieve a loan by its ID.
- **POST /api/v1/loans/create**: Create a new loan.
- **DELETE /api/v1/loans/delete/{id}**: Delete a loan by its ID.

### Person Endpoints
- **GET /api/v1/persons**: Retrieve all persons.
- **POST /api/v1/persons/create**: Create a new person.
- **DELETE /api/v1/persons/delete/{id}**: Delete a person by their ID.

## API Documentation
This project includes API documentation generated using **Swagger**. The documentation provides details about all available endpoints, request/response structures, and example payloads.

## How to Run
1. Clone the repository.
2. Navigate to the project directory.
3. Run the application using:
   ```bash
   mvn spring-boot:run

4. Access the API at `http://localhost:8080/api/v1/`.
5. Use tools like Postman or curl to test the endpoints.
6. Ensure MongoDB is running and configured correctly in `application.properties`.