FROM eclipse-temurin:17-jdk-jammy
EXPOSE 8080
ARG JAR_FILE=target/DB-Sharding-1.0.0-spring-boot.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "/app.jar"]
