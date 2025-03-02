FROM openjdk:17
EXPOSE 8080
ADD target/docker-with-spring.jar docker-with-spring.jar
ENTRYPOINT ["java", "-jar", "/docker-with-spring.jar"]
