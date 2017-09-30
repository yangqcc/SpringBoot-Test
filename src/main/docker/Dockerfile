FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD springboot-test-2.0.jar app.jar
EXPOSE 18080
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]