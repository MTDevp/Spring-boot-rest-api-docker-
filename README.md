# Spring-boot-rest-api-docker-

```sh
java -version
mvn clean install
docker build -t my-spring-boot-app .
docker image ls
docker run -p 8080:8080 my-spring-boot-app

