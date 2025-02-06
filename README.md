# 🌱 Waste Sorting API

## 📌 Overview
This is a Spring Boot REST API for a waste sorting mobile application. 
The API provides endpoints for managing waste categories, disposal guidelines, and recycling tips, promoting sustainable waste management.

## 🛠️ Tech Stack
- Java 21
- Spring Boot 3+ (Spring Web, Spring Data JPA, Spring Validation)
- H2 Database (In-Memory)
- Maven (Build & Dependency Management)
- Lombok (Reduces Boilerplate Code)

## 📂 Project Structure
src/main/java/com/enviro/assessment/grad001/lehlonolomokoena.waste_api
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


## 🚀 Running the Project

### 1️⃣ Prerequisites

Ensure you have installed:

- Java 17+ → [Download Here](https://www.oracle.com/java/technologies/javase-jdk17-downloads.html)
- Apache Maven → [Download Here](https://maven.apache.org/download.cgi)
- VS Code / IntelliJ IDEA (Recommended for development)

### 2️⃣ Clone the Repository

```bash
git clone https://github.com/lehlonolo27/waste-sorting-api.git
cd waste-sorting-api
