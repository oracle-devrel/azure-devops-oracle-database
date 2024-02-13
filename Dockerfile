FROM openjdk
ADD target/oracleai-0.0.1-SNAPSHOT.jar oracleai-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","oracleai-0.0.1-SNAPSHOT.jar"]