FROM eclipse-temurin:17-jre-alpine

COPY target/lib /app/lib

COPY target/datamanager-0.0.1-SNAPSHOT.jar /app/app.jar

WORKDIR /app

CMD ["java", "-cp", "app.jar:lib/*", "br.com.jcmonsilv.bcontrol.datamanager.DatamanagerApplication"]