FROM openjdk:21-jdk-slim

COPY Server/build/libs/Server-0.0.1-SNAPSHOT.jar .

EXPOSE 8085

ENTRYPOINT ["java", "-jar", "Server-0.0.1-SNAPSHOT.jar"]
