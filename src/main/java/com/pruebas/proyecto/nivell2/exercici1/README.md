# Nivell 2: Custom annotations

## Exercise 1: `@JsonSerializable`

This exercise introduces custom annotations and runtime reflection in Java. The goal is to define a reusable annotation that marks 
a class as serialisable to JSON and then use reflection to discover that metadata at runtime.

### What the application does

The project defines a custom annotation named `@JsonSerializable`, which stores the destination directory where the generated JSON 
file should be saved. The `Person` class is annotated with:

```java
@JsonSerializable(destinationDirectory = "output")
```

The `JsonSerializer` class reads the annotation from the class at runtime, validates that the class is correctly annotated, 
creates the target directory if it does not exist, and writes the object as a JSON file using Jackson.

### Main components

- `Person`: model class annotated with `@JsonSerializable`.
- `JsonSerializable`: custom annotation with runtime retention and target `TYPE`.
- `JsonSerializer`: reflection-based serializer that writes the object to disk.
- `Main`: creates a `Person` instance and calls the serializer.

### How it works

`JsonSerializer.serialize(Object)` calls:

```java
object.getClass().getAnnotation(JsonSerializable.class);
```

If the annotation is missing, the method throws an `IllegalArgumentException`. Otherwise, it:

1. creates the configured output directory;
2. names the file using the class name (`Person.json`);
3. writes the object to disk with Jackson's `ObjectMapper`;
4. returns the generated `File`.

### Run the exercise

From the project root:

```bash
mvn compile org.codehaus.mojo:exec-maven-plugin:3.5.0:java -Dexec.mainClass=com.pruebas.proyecto.nivell2.exercici1.Main
```

The console prints the path of the generated JSON file, and the file is saved in the `output` folder.

### Run the tests

The tests use JUnit Jupiter. Run them with the Surefire version configured in `pom.xml`:

```bash
mvn test
```

### Example output

```text
JSON saved to output/Person.json
```
