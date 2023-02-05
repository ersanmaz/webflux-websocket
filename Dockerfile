FROM openjdk:17
WORKDIR /app
ARG JAR_FILE=target/webflux-websocket.jar
COPY ${JAR_FILE} webflux-websocket.jar
ENTRYPOINT ["java", "-jar", "webflux-websocket.jar"]