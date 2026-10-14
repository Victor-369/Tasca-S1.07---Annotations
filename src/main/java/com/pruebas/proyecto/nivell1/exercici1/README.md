# Nivell 1: Basic annotations

## Exercise 1: `@Override`

This exercise practises inheritance and polymorphism with a worker hierarchy. The `@Override` annotation marks the salary calculation implemented by each worker type.

### Worker types

| Class | Salary calculation |
|---|---|
| `Worker` | Hourly rate × hours worked |
| `OnlineWorker` | Hourly rate × hours worked + fixed internet allowance (30) |
| `OnSiteWorker` | Hourly rate × hours worked + shared petrol allowance (15) |

`OnlineWorker` and `OnSiteWorker` extend `Worker` and override `calculateSalary`. Both reuse the base calculation, which rejects negative working hours.

`Main` demonstrates polymorphism by assigning instances of both subclasses to `Worker` references and calling `calculateSalary`.

### Run the exercise

From the project root:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici1.Main
```

### Run the tests

The tests use JUnit Jupiter. Run them with the Surefire version configured in `pom.xml`:

```bash
mvn test
```
