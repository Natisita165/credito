FROM azul/zulu-openjdk:11.0.10
RUN apt update

RUN mkdir -p /opt/arquitectura/logs
VOLUME /opt/arquitectura/logs
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENV SERVER_PORT 9010
ENV EUREKA_URI "http://localhost:8761/eureka"
ENV URI_CONFIG "http://localhost:8888"
ENV URL_BD "jdbc:postgresql://localhost:5432/atm"
ENTRYPOINT ["java", \
            "-cp", \
            "app:app/lib/*", \
            "bo.edu.ucb.credito.CreditoApplication"]