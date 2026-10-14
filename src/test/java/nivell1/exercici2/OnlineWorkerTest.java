package nivell1.exercici2;

import com.pruebas.proyecto.nivell1.exercici2.model.OnlineWorker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OnlineWorkerTest {
    @Test
    void constructor_givenValidData_storesOnlineWorkerDetails() {
        OnlineWorker onlineWorker = new OnlineWorker("Elisa", "Thorn", 40);

        assertEquals("Elisa", onlineWorker.getName());
        assertEquals("Thorn", onlineWorker.getSurname());
        assertEquals(40, onlineWorker.getPriceHour());
    }

    @Test
    void calculateSalary_givenTenHours_includesInternetAllowance() {
        OnlineWorker onlineWorker = new OnlineWorker("John", "Smith", 36);

        assertEquals(390, onlineWorker.calculateSalary(10));
    }

    @Test
    void calculateSalary_givenZeroHours_returnsInternetAllowance() {
        OnlineWorker onlineWorker = new OnlineWorker("John", "Smith", 36);

        assertEquals(30, onlineWorker.calculateSalary(0));
    }

    @Test
    void calculateSalary_givenNegativeHours_throwsIllegalArgumentException() {
        OnlineWorker onlineWorker = new OnlineWorker("John", "Smith", 36);

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> onlineWorker.calculateSalary(-12)
        );

        assertEquals("Total hours cannot be negative", exception.getMessage());
    }

    @Test
    void constructor_givenNullName_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new OnlineWorker(null, "Smith", 36)
        );

        assertEquals("Name cannot be null or blank", exception.getMessage());
    }

    @Test
    void constructor_givenBlankSurname_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new OnlineWorker("John", "  ", 36)
        );

        assertEquals("Surname cannot be null or blank", exception.getMessage());
    }

    @Test
    void constructor_givenNegativePricePerHour_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new OnlineWorker("John", "Smith", -1)
        );

        assertEquals("Price per hour cannot be negative", exception.getMessage());
    }

    @Test
    @SuppressWarnings("deprecation")
    void calculateSalaryIncludingInternetAllowance_givenTenHours_matchesCurrentSalaryCalculation() {
        OnlineWorker worker = new OnlineWorker("John", "Smith", 36);

        assertEquals(
                worker.calculateSalary(10),
                worker.calculateSalaryIncludingInternetAllowance(10, 30d)
        );
    }

    @Test
    void calculateSalaryIncludingInternetAllowance_whenInspected_isMarkedDeprecated() throws NoSuchMethodException {
        assertTrue(OnlineWorker.class
                .getMethod("calculateSalaryIncludingInternetAllowance", int.class, double.class)
                .isAnnotationPresent(Deprecated.class));
    }
}
