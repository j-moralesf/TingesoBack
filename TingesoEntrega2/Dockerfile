FROM openjdk:11-oracle

COPY . .

RUN chmod +x ./gradlew

RUN ./gradlew build

COPY . .

CMD ["java" , "-jar -Dserver.port1818", "/build/libs/TingesoEntrega2-0.0.1-SNAPSHOT.jar"]

EXPOSE 1818