package nivell1.exercici1;

import com.pruebas.proyecto.nivell1.exercici1.model.Worker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class WorkerTest {
    @Test
    void constructor_givenDifferentData_assignsEachAttribute() {
        Worker worker = new Worker("John", "Smith", 36);

        assertEquals("John", worker.getName());
        assertEquals("Smith", worker.getSurname());
        assertEquals(36, worker.getPriceHour());
    }

    @Test
    void calculateSalary_givenTenHours_returns360() {
        Worker worker = new Worker("John", "Smith", 36);

        assertEquals(360, worker.calculateSalary(10));
    }

    @Test
    void calculateSalary_givenZeroHours_returnsZero() {
        Worker worker = new Worker("John", "Smith", 0);

        assertEquals(0, worker.calculateSalary(10));
    }

    @Test
    void calculateSalary_givenNegativeHours_throwsIllegalArgumentException() {
        Worker worker = new Worker("John", "Smith", 10);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> worker.calculateSalary(-12)
        );

        assertEquals("Total hours cannot be negative", exception.getMessage());
    }

    @Test
    void constructor_givenNullName_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Worker(null, "Smith", 36)
        );

        assertEquals("Name cannot be null or blank", exception.getMessage());
    }

    @Test
    void constructor_givenNullSurname_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Worker("John", null, 36)
        );

        assertEquals("Surname cannot be null or blank", exception.getMessage());
    }

    @Test
    void constructor_givenNegativePriceHour_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new Worker("John", "Smith", -32)
        );

        assertEquals("Price per hour cannot be negative", exception.getMessage());
    }
}
