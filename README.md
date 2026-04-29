# 🚀 Spring Boot JPA CRUD Application

This is a simple **CRUD (Create, Read, Update, Delete)** project built using **Spring Boot, Spring Data JPA, and MySQL**.

It demonstrates basic backend development concepts with a layered architecture (Controller → Service → Repository).

---

## 🛠️ Tech Stack

* Java 17+
* Spring Boot
* Spring Data JPA
* Hibernate
* MySQL Database
* Maven

---

## 📌 Features

✔ Add new student
✔ Get student by ID
✔ Get all students
✔ Update student details
✔ Delete student
✔ MySQL database integration
✔ Layered architecture (Controller, Service, Repository)

---

## 🏗️ Project Structure

```
src/main/java
 └── in.vk.main
      ├── controller
      ├── services
      ├── repository
      ├── entities
      └── SpringbootJpAprojectApplication.java
```

---

## ⚙️ Database Configuration

Update your `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/college
spring.datasource.username=root
spring.datasource.password=root

spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

---

## ▶️ How to Run the Project

1. Clone the repository

```bash
git clone https://github.com/vkfullstack/curdoperationJPA.git
```

2. Import into Eclipse / IntelliJ

3. Configure MySQL database

4. Run Spring Boot application

```bash
mvn spring-boot:run
```

---

## 📦 Sample Entity

```java
@Entity
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;
    private int rollno;
    private int marks;
}
```

---

## 🎯 Learning Outcome

This project helps you understand:

* Spring Boot project structure
* JPA/Hibernate working
* CRUD operations
* Dependency Injection
* REST API basics

---

## 👨‍💻 Author

* GitHub: vkfullstack
* Project: Spring Boot JPA CRUD

---

⭐ If you like this project, don't forget to star the repository!
