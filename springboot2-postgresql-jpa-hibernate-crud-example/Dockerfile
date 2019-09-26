FROM openjdk:8-jdk-alpine
RUN mkdir -p /home/java-app-test/
WORKDIR /home/java-app-test/
COPY ./target/springboot2-postgresql-jpa-hibernate-crud-example-0.0.1-SNAPSHOT.jar ./
#COPY ./run.sh ./
WORKDIR /home/java-app-test/
#RUN chmod a+x ./run.sh
EXPOSE 8080
#CMD ["./run.sh"]
CMD ["java", "-jar", "./springboot2-postgresql-jpa-hibernate-crud-example-0.0.1-SNAPSHOT.jar"]
