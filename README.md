# Java annotations exercises

This repository contains Java exercises for practising annotations. Each level and exercise is documented alongside its source code.

## Requirements

- JDK 25
- Maven

## Project structure

- `src/main/java/com/pruebas/proyecto/nivell1/` — Nivell 1 exercises.
- `src/main/java/com/pruebas/proyecto/nivell2/` — Nivell 2 exercises.
- `Main.java` in each exercise directory — runnable exercise entry points.
- `src/test/java/` — automated tests.

## Run the application

From the project root:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici1.Main
```

## Run the tests

The tests use JUnit Jupiter. Run them with the Surefire version configured in `pom.xml`:

```bash
mvn test
```
