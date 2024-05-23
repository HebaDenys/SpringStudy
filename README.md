# studyProject

## Descrizione
Il progetto "studyProject" è un'applicazione Spring Boot progettata per dimostrare l'uso di componenti e funzionalità di Spring, come la gestione dei bean, la configurazione delle proprietà e l'integrazione con Thymeleaf per la generazione di pagine HTML dinamiche.

## Struttura del Progetto

- **src/main/java/com/hebadenysprojects/studyProject**
  - `ApplicationConfig.java`: Configurazione dei bean.
  - `FirstClass.java`: Classe di esempio per un bean.
  - `SecondClass.java`: Altra classe di esempio per un bean.
  - `HelloController.java`: Controller che espone un endpoint di base.
  - `MyFirstService.java`: Servizio che utilizza i bean e le proprietà configurate.
  - `StudyProjectApplication.java`: Punto di ingresso principale dell'applicazione.

- **src/main/resources**
  - `application.properties`: Configurazione delle proprietà principali.
  - `application-dev.properties`: Configurazione delle proprietà per il profilo di sviluppo.
  - `custom.properties` e `custom2.properties`: File di proprietà personalizzati.
  - `templates/employees.html`: Template Thymeleaf per la gestione degli impiegati.

## Prerequisiti

- Java 17
- Maven
- Docker

## Come Eseguire

1. Clona il repository:
    ```sh
    git clone <repository-url>
    cd studyProject
    ```

2. Costruisci l'applicazione con Maven:
    ```sh
    ./mvnw clean install
    ```

3. Avvia l'applicazione con Docker Compose:
    ```sh
    docker-compose up --build
    ```

4. Apri il browser e vai su `http://localhost:8080`.

## Miglioramenti

- Aggiungi test unitari e di integrazione.
- Implementa misure di sicurezza.
- Aggiungi monitoraggio e logging.
- Utilizza Docker Compose e Spring Boot DevTools per migliorare il flusso di lavoro di sviluppo.
