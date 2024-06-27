FROM openjdk:17
EXPOSE 8080
ADD target/springmongodb.jar springmongodb.jar
ENTRYPOINT [ "java", "-jar" ,"springmongodb.jar" ]