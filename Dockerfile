FROM openjdk
EXPOSE 8080

CMD ls /tmp
COPY --from=maven_build /tmp/target/oracleai-0.0.1-SNAPSHOT.jar /app/oracleai-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/app/oracleai-0.0.1-SNAPSHOT.jar"]