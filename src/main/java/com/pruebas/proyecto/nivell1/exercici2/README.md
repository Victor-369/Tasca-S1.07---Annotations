# Level 1: Basic annotations

## Exercise 2: `@Deprecated`

This exercise demonstrates how to mark methods as deprecated and how to suppress deprecation warnings when legacy methods are called.

`OnlineWorker` and `OnSiteWorker` both override `calculateSalary(int)`. The online worker's calculation includes a fixed internet allowance of 30, while the
on-site worker's calculation includes a petrol allowance of 15.

Each subclass also has a deprecated salary method:

| Class | Deprecated method | Parameters |
|---|---|---|
| `OnlineWorker` | `calculateSalaryIncludingInternetAllowance` | Total monthly hours and internet allowance |
| `OnSiteWorker` | `calculateSalaryIncludingPetrolAllowance` | Total monthly hours and petrol allowance |

These legacy methods calculate the hourly pay and add the allowance supplied by the caller. Their Javadoc recommends using `calculateSalary(int)`, which applies
the relevant allowance configured by the worker class.

`Main` is outside the `model` package and invokes both deprecated methods. `@SuppressWarnings("deprecation")` on `main` suppresses the compiler warnings
for those calls.

### Run the exercise

From the project root:

```bash
mvn compile
java -cp target/classes com.pruebas.proyecto.nivell1.exercici2.Main
```

### Run the tests

The tests use JUnit Jupiter. Run them with the Surefire version configured in `pom.xml`:

```bash
mvn test
```
