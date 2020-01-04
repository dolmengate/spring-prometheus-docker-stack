FROM maven:3.6-jdk-8 as build
WORKDIR /root/.m2
WORKDIR /app
COPY . /app
RUN mvn -B -V clean verify

FROM openjdk:8-jre-slim
WORKDIR /app
COPY --from=build /app/target/*.jar /app/app.jar
CMD exec java $JAVA_OPTS -jar /app/app.jar
