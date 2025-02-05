#🌱 Waste Sorting API

##📌 Overview
This is a Spring Boot REST API for a waste sorting mobile application. 
The API provides endpoints for managing waste categories, disposal guidelines, and recycling tips, promoting sustainable waste management.

##🛠️ Tech Stack
-Java 21
-Spring Boot 3+ (Spring Web, Spring Data JPA, Spring Validation)
-H2 Database (In-Memory)
-Maven (Build & Dependency Management)
-Lombok (Reduces Boilerplate Code)

##📂 Project Structure

src/main/java/com/enviro/assessment/grad001/lehlonolomokoena.waste_sorting_api
│── Application.java  (Main class)
│── model
│   ├── WasteCategory.java
│── repository
│   ├── WasteCategoryRepository.java
│── service
│   ├── WasteCategoryService.java
│── controller
│   ├── WasteCategoryController.java
│── dto
│   ├── WasteCategoryDTO.java
│── exception
│   ├── GlobalExceptionHandler.java

##🚀 Running the Project

###1️⃣ Prerequisites

Ensure you have installed:

Java 17+ → Download Here

Apache Maven → Download Here

VS Code / IntelliJ IDEA (Recommended for development)

###2️⃣ Clone the Repository

git clone https://github.com/lehlonolo27/waste-sorting-api.git
cd waste-sorting-api

###3️⃣ Run the Application

mvn spring-boot:run

The API will start at: http://localhost:8080

H2 Database Console: http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:testdb)
