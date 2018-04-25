FROM java:8
WORKDIR /
ADD target/SoftwEng-0.1.0.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]