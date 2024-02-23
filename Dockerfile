FROM openjdk:17-slim
ADD target/oraclemulticloud-0.0.1-SNAPSHOT.jar oraclemulticloud-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","oraclemulticloud-0.0.1-SNAPSHOT.jar"]