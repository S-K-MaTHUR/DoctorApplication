# Doctor Application System
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
