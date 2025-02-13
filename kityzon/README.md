#How to compile and run the main class

http://localhost:8080/home


Move the home.html file to templates folder under src/main/templates

#check all process:
ps -fea | grep java

kill the process:
kill -9 22317


#start the spring boot
mvn clean

mvn package

mvn spring-boot:run

mvn package assembly:single  









