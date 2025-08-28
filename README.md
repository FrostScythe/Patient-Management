# Patient Management System

## Overview
The Patient Management System is a Java-based application designed to manage patient data. It provides RESTful APIs for managing patients, including retrieving patient information. The project is built using Spring Boot and follows a modular structure for better maintainability.

---
## Prerequisites
Before setting up the project, ensure you have the following installed on your system:

1. **Java Development Kit (JDK)**: Version 17 or higher.
2. **Maven**: Version 3.8.0 or higher.
3. **Git**: For version control.
4. **Postman** (optional): For testing API endpoints.

## Project Structure
The project is organized as follows:

```
patient-service/
├── src/
│   ├── main/
│   │   ├── java/com/pm/patient_service/
│   │   │   ├── controller/        # REST controllers
│   │   │   ├── dto/               # Data Transfer Objects
│   │   │   ├── mapper/            # Mappers for DTOs and entities
│   │   │   ├── model/             # Entity classes
│   │   │   ├── repository/        # Data access layer
│   │   │   ├── service/           # Business logic layer
│   │   ├── resources/
│   │       ├── application.properties  # Configuration file
│   │       ├── data.sql                # Initial data for the database
│   ├── test/                           # Unit and integration tests
├── pom.xml                              # Maven configuration file
├── mvnw, mvnw.cmd                       # Maven wrapper scripts
```
---
## Setup Instructions
Follow these steps to set up the project on your local system:

1. **Clone the Repository**
   ```bash
   git clone https://github.com/FrostScythe/Patient-Management
   cd patient-management/patient-service
   ```

2. **Build the Project**
   Use Maven to build the project and download dependencies:
   ```bash
   ./mvnw clean install
   ```

3. **Configure the Application**
   Update the `application.properties` file in `src/main/resources` to configure the database connection and other settings. By default, the project uses an in-memory H2 database.

4. **Run the Application**
   Start the application using the Maven wrapper:
   ```bash
   ./mvnw spring-boot:run
   ```

5. **Access the Application**
   The application will be available at `http://localhost:8080`.

6. **Test the APIs**
   Use the provided Postman collection in `api-requests/patient-service/get-patients.http` to test the API endpoints. You can also use tools like Postman or cURL.

## API Endpoints
The following API endpoints are available:

- **GET /patients**: Retrieve a list of all patients.

## Additional Notes
- The project includes sample data in `data.sql` for testing purposes.
- The `HELP.md` file contains additional information about the project.

## Troubleshooting
If you encounter any issues, ensure that:
- All prerequisites are installed correctly.
- The `application.properties` file is configured properly.
- The required ports are not in use by other applications.
---
## License
This project is licensed under the MIT License.