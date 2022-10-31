# Use the official maven/Java 8 image to create a build artifact.
# https://hub.docker.com/_/maven
FROM eclipse-temurin:17-jdk-alpine as builder

# Copy local code to the container image.
WORKDIR /app
COPY pom.xml .
COPY src ./src

RUN mvn verify --fail-never

# Build a release artifact.
RUN mvn package -DskipTests

# Use AdoptOpenJDK for base image.
# It's important to use OpenJDK 8u191 or above that has container support enabled.
# https://hub.docker.com/r/adoptopenjdk/openjdk8
# https://docs.docker.com/develop/develop-images/multistage-build/#use-multi-stage-builds
FROM eclipse-temurin:17-jdk-alpine

# Copy the jar to the production image from the builder stage.
COPY --from=builder /app/target/ejemplo-*.jar ejemplo.jar

# Run the web service on container startup.
CMD java $JAVA_OPTS -Dserver.port=$PORT -jar ejemplo.jar



#COPY "./target/ejemplo-0.0.1-SNAPSHOT.jar" "app.jar"
#EXPOSE 8080
#ENTRYPOINT ["java","-jar","app.jar"]
