# Quick Start Java Spring Boot & MongoDB Atlas Project which can be deployed on Azure App Service
This is a demo springboot application created using IntelliJ Spring Initialzr And Azure Plugin 
to show how to connect to Atlas using a Java Spring Boot Application and deploy it as a Microsoft Azure Wep App(AppService)

## Supported versions:

- Java 11 (Microsoft OpenJDK )
- Spring boot 2.7.10
- Spring Data MongoDB
- MongoDB Atlas
- Maven 

## MongoDB Atlas

- Get started with a Free Tier Cluster on [MongoDB Atlas](https://www.mongodb.com/cloud/atlas).
- Read this blog post: [Quick Start - Getting your Free MongoDB Atlas Cluster](https://developer.mongodb.com/quickstart/free-atlas-cluster).
- You might need to add mongodb.properties file if you don't want to use application properties directly, (the benefit lies that the optional properties file could be added to gitignore and used only for dev purposes and secrets never flow to Git) and add the default MongoDB URI `spring.data.mongodb.uri`, database `spring.data.mongodb.database` (if required).

Please note:
- Spring data automatically detects the database either from the connection string (spring.data.mongodb.uri) 
- if spring.data.mongodb.database is specified, this value is taken as the database and it overrides the database specified in the above key (URL), and
- the collection is taken by spring.data.mongodb.collection or @Document annotation, if this property is not specified 

## How To Run

Replace the Atlas URI in application.properties and run as a spring boot application.

## Commands

- Start the server in a console with `mvn spring-boot:run`.
- If you add some Unit Tests, you would start them with `mvn clean test`.
- You can build the project with `mvn clean package`.

## Disclaimer
Use at your own risk; not a supported MongoDB product

## Author
- Megha Arora @ MongoDB.
