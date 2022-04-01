FROM openjdk:11-jdk
EXPOSE 8080
ADD target/getir.jar getir.jar
ENTRYPOINT ["java","-jar","/getir.jar"]
