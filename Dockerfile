FROM ubuntu:20.04

# Installazione delle dipendenze necessarie
RUN apt-get update && apt-get install -y wget unzip

# Scarica e installa OpenJDK 22 (adatta il link di download all'ultima versione disponibile)
RUN wget https://download.java.net/java/GA/jdk22/ri/openjdk-22+36_linux-x64_bin.tar.gz
RUN tar -xzf openjdk-22+36_linux-x64_bin.tar.gz -C /opt
RUN mv /opt/jdk-22 /opt/java-22
ENV JAVA_HOME /opt/java-22
ENV PATH $JAVA_HOME/bin:$PATH

# Crea una directory temporanea
VOLUME /tmp

# Copia il file JAR dalla directory target del progetto nella directory app.jar nel container
COPY target/studyProject-0.0.1-SNAPSHOT.jar app.jar

# Imposta il punto di ingresso per avviare l'applicazione
ENTRYPOINT ["java", "--enable-preview", "-jar", "/app.jar"]
