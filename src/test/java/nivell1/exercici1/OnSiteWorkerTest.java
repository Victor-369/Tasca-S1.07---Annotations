package nivell1.exercici1;

import com.pruebas.proyecto.nivell1.exercici1.model.OnSiteWorker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OnSiteWorkerTest {
    @Test
    void constructor_givenValidData_storesOnSiteWorkerDetails() {
        OnSiteWorker onSiteWorker = new OnSiteWorker("Elisa", "Thorn", 40);

        assertEquals("Elisa", onSiteWorker.getName());
        assertEquals("Thorn", onSiteWorker.getSurname());
        assertEquals(40, onSiteWorker.getPriceHour());
    }

    @Test
    void calculateSalary_givenTenHours_includesPetrolAllowance() {
        OnSiteWorker onSiteWorker = new OnSiteWorker("John", "Smith", 36);

        assertEquals(375, onSiteWorker.calculateSalary(10));
    }

    @Test
    void calculateSalary_givenZeroHours_returnsPetrolAllowance() {
        OnSiteWorker onSiteWorker = new OnSiteWorker("John", "Smith", 36);

        assertEquals(15, onSiteWorker.calculateSalary(0));
    }

    @Test
    void constructor_givenNullName_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new OnSiteWorker(null, "Smith", 36)
        );

        assertEquals("Name cannot be null or blank", exception.getMessage());
    }

    @Test
    void constructor_givenBlankSurname_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new OnSiteWorker("John", "  ", 36)
        );

        assertEquals("Surname cannot be null or blank", exception.getMessage());
    }

    @Test
    void constructor_givenNegativePricePerHour_throwsIllegalArgumentException() {
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> new OnSiteWorker("John", "Smith", -1)
        );

        assertEquals("Price per hour cannot be negative", exception.getMessage());
    }
}
