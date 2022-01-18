FROM openjdk:11-oracle

COPY . .

RUN chmod +x ./gradlew
RUN ./gradlew build

COPY build/libs/TingesoEntrega2-0.0.1-SNAPSHOT.jar TingesoEntrega2-0.0.1-SNAPSHOT.jar

COPY docker-entrypoint.sh /

RUN chmod +x docker-entrypoint.sh

ENTRYPOINT ["bash", "docker-entrypoint.sh"]

EXPOSE 30000