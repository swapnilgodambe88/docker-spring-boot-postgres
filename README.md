# docker-spring-boot-postgres
Spring Boot application with the popular open-source database PostgreSQL.
Instead of installing PostgreSQL as a separate application, we’ll use Docker Compose to run Spring Boot and PostgreSQL.

## Prerequisites
We need a docker application running locally to run the application.

## Commands
### Running through Docker
To build the application locally, issues the following commands to start a postgres container and start the spring-boot application that would connect to the postgres database
```
docker-compose build --no-cache service && docker-compose up service
```
To take down the service, issue the following command
```
docker-compose down service
```
While the application is running locally, you can easily connect to the postgres database instance which is exposed through port 5432 outside of container. You can use any DB client like DBeaver to connect to PostGres database.
```
URL: jdbc:postgresql://localhost:5432/postgres
Username: postgres-username
Password: postgres-password
```
