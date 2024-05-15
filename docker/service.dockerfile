FROM maven:3.8.6-openjdk-18 AS prepare

WORKDIR /app/build
COPY pom.xml .
COPY . .
FROM prepare AS build

RUN mvn package -Dmaven.test.skip=true -P allow-snapshots
#COPY ./target/docker-spring-boot-postgres.jar /app/build/target/

FROM openjdk:18-jdk

COPY --from=build /app/build/target/docker-spring-boot-postgres.jar /app/service.jar
COPY ./docker/files/entrypoint.sh /app/

RUN chmod -R 777 /app/

WORKDIR /app
EXPOSE 8080
ENTRYPOINT ["/app/entrypoint.sh"]
