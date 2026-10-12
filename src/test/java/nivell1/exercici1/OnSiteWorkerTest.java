package nivell1.exercici1;

import com.pruebas.proyecto.nivell1.exercici1.model.OnSiteWorker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class OnSiteWorkerTest {
    @Test
    void constructor_givenValidData_storesOnSiteWorkerDetails() {
        OnSiteWorker workerOnSite = new OnSiteWorker("Elisa", "Thorn", 40);

        assertEquals("Elisa", workerOnSite.getName());
        assertEquals("Thorn", workerOnSite.getSurname());
        assertEquals(40, workerOnSite.getPriceHour());
        assertEquals(15, workerOnSite.getPetrol());
    }

    @Test
    void calculateSalary_givenTenHours_includesPetrolAllowance() {
        OnSiteWorker workerOnSite = new OnSiteWorker("John", "Smith", 36);

        assertEquals(375, workerOnSite.calculateSalary(10));
    }

    @Test
    void calculateSalary_givenZeroHours_returnsPetrolAllowance() {
        OnSiteWorker workerOnSite = new OnSiteWorker("John", "Smith", 36);

        assertEquals(15, workerOnSite.calculateSalary(0));
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
