FROM openjdk:17.0-oracle
WORKDIR /app
COPY ./build/libs/apilol-0.0.1-SNAPSHOT.jar /app/miApp.jar
ENTRYPOINT ["java", "-jar", "miApp.jar"]