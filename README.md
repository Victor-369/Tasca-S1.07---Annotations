# Java annotations exercises

This repository contains Java exercises for practising annotations. Each level and exercise is documented alongside its source code.

## Requirements

- JDK 25
- Maven

## Project structure

- `src/main/java/com/pruebas/proyecto/nivell1/` — Nivell 1 exercises.
- `src/main/java/com/pruebas/proyecto/Main.java` — application entry point.
- `src/test/java/` — automated tests.

## Run the application

From the project root:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.Main
```

## Run the tests

The tests use JUnit 5. Use a JUnit 5-compatible Surefire version to run them:

```bash
mvn test-compile org.apache.maven.plugins:maven-surefire-plugin:3.5.3:test
```
