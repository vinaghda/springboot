FROM openjdk:8-jdk-alpine
RUN mkdir -p /home/java-app-test/
WORKDIR /home/java-app-test/
COPY ./target/springboot2-postgresql-jpa-hibernate-crud-example-0.0.1-SNAPSHOT.jar ./
WORKDIR /home/java-app-test/
EXPOSE 8080
CMD ["java", "-jar", "./springboot2-postgresql-jpa-hibernate-crud-example-0.0.1-SNAPSHOT.jar"]
