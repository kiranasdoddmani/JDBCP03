# Java Database Connectivity (JDBC)

## Description

This project demonstrates how to connect a Java application to a MySQL
database using JDBC (Java Database Connectivity).

The project performs database operations such as:

- Connecting Java to MySQL
- Updating records in a MySQL table
- Executing SQL queries using `Statement`
- Using `executeUpdate()` to modify database records
- Managing the MySQL JDBC dependency using Maven

## Technologies Used

- Java
- JDBC
- MySQL
- Maven
- MySQL Connector/J
- IntelliJ IDEA

## Project Structure

```text
src/
└── main/
    └── java/
        └── org/
            └── example/
                ├── App.java
                └── config/
                    └── DBConfig.java

pom.xml
README.md
