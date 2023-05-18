<center>
<h1> Doctor Application System </h1>
</center>
<center>
<a href="Java url">
    <img alt="Java" src="https://img.shields.io/badge/Java->=8-darkblue.svg" />
</a>
<a href="Maven url" >
    <img alt="Maven" src="https://img.shields.io/badge/Maven-3.0.6-brightgreen.svg" />
</a>
   <a >
    <img alt="MySQL" src="https://img.shields.io/badge/MySQL-blue.svg">
  </a>
</center>

The Doctor Application System is a web-based application built using Java and Spring Boot. It allows doctors to manage their patients and appointments effectively. This README provides an overview of the application and instructions for setting up and running the system.

# Features

* Doctor Management: Doctors can be created, updated, and deleted. Each doctor has a unique identifier and a name.
* Patient Management: Patients can be created, updated, and deleted. Each patient has a unique identifier and a name.
* Appointment Management: Appointments can be scheduled between doctors and patients. Each appointment has a unique identifier, a doctor, a patient, and other optional attributes such as date and time.

# Technologies Used
The Doctor Application System is built using the following technologies:

* Java: The primary programming language used to develop the application.
* Spring Boot: A Java framework that simplifies the development of web applications.
* Spring Data JPA: A module of Spring Data that provides easy integration with the JPA (Java Persistence API) for database access.
* Maven: A build automation tool used to manage dependencies and build the project.

## Dependencies
The following dependencies are required to run the project:

* Spring Boot Dev Tools
* Spring Web
* Spring Data JPA
* MySQL Driver
* Lombok
* Validation
* Swagger

## Database Configuration
To connect to a MySQL database, update the application.properties file with the appropriate database URL, username, and password. The following properties need to be updated:
```
spring.datasource.driverClassName=com.mysql.cj.jdbc.Driver
spring.datasource.url = jdbc:mysql://localhost:3306/<DatabaseName>
spring.datasource.username = <userName>
spring.datasource.password = <password>
spring.jpa.show-sql = true
spring.jpa.hibernate.ddl-auto = update

spring.jpa.properties.hibernate.show_sql=true
spring.jpa.properties.hibernate.use_sql_comments=true
spring.jpa.properties.hibernate.format_sql=true

```
# Data Model

*Authentication Token
tokenId : Long
token : String
tokenCreationDate : LocalDate

*Doctor
doctorId : Long
doctorName : String
specialization : Enum

*Patient
patientId : Long
patientFirstName : String
patientLastName: String
patientEmail : String
patientPassword : String
patientContact : String

## Data Flow

1. The user at client side sends a request to the application through the API endpoints.
2. The API receives the request and sends it to the appropriate controller method.
3. The controller method makes a call to the method in service class.
4. The method in service class builds logic and retrieves or modifies data from the database, which is in turn given to controller class
5. The controller method returns a response to the API.
6. The API sends the response back to the user.

# API Documentation
The Doctor Application System provides a RESTful API for managing doctors, patients, and appointments. The API endpoints and their usages are documented below:

*Appointment Controller
  PostMapping("/appointment")

*Doctor Controller
  PostMapping("/doctor")
  GetMapping("{docId}/appointments")
 
 *Patient Controller
   PostMapping("/patient/signup")
   PostMapping("/patient/signin")
   GetMapping("/doctors")
   DeleteMapping("appointment")
 
 # Conclusion
 The Doctor Application System simplifies the management of doctors, patients, and appointments. By following the steps outlined in this README, you can easily set up and run the system on your local machine.
