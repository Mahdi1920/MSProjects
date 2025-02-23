FROM openjdk:17-jdk-alpine
LABEL authors="Mahdi"
EXPOSE 8083
ADD target/GatewayAPI-0.0.1.jar GatewayAPI-0.0.1.jar
ENTRYPOINT ["java","-jar","/GatewayAPI-0.0.1.jar"]