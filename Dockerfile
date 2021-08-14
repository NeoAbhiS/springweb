FROM openjdk:16
RUN mkdir /app
COPY target/springweb-0.0.1-SNAPSHOT.jar /app/springweb.jar
WORKDIR /app
ENTRYPOINT ["java","-jar","springweb.jar"]
