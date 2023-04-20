FROM openjdk:17-alpine
VOLUME /tmp
COPY target/docker-example-microservice-0.0.1-SNAPSHOT.jar docker-example.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/docker-example.jar"]