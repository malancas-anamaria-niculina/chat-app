# chat-app

## Start the server using maven
### Maven setup
1. Install Maven from https://maven.apache.org/download.cgi
2. Unzip Maven to a location
3. Set `MAVEN_HOME` location in System Variables
5. Set path to Maven in Path variable `(%MAVEN_HOME%\bin)`
6. Make sure that Maven Plugin exists in pom.xml
```
<plugin>
  <groupId>org.springframework.boot</groupId>
  <artifactId>spring-boot-maven-plugin</artifactId>
</plugin>
```
### Build Spring Boot project using Maven
```
mvn package
```
### Run Spring Boot app using Maven
```
mvn spring-boot:run
```
