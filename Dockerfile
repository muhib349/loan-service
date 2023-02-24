FROM openjdk:17-oracle

#Information around who maintains the image
MAINTAINER com.abc.mohib.bank

COPY target/loan-service-0.0.1-SNAPSHOT.jar loan-service-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/loan-service-0.0.1-SNAPSHOT.jar"]