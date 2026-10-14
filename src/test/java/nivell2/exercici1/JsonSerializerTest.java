package nivell2.exercici1;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.pruebas.proyecto.nivell2.exercici1.JsonSerializer;
import com.pruebas.proyecto.nivell2.exercici1.Person;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class JsonSerializerTest {

    @Test
    void serialise_givenAnnotatedPerson_writesJsonToAnnotatedDirectory() throws IOException {
        Person person = new Person("Ada Lovelace", 36);
        JsonSerializer serializer = new JsonSerializer();

        File file = serializer.serialize(person);

        try {
            assertTrue(file.exists());
            assertEquals(new File("output", "Person.json"), file);

            JsonNode json = new ObjectMapper().readTree(file);
            assertEquals("Ada Lovelace", json.get("name").asText());
            assertEquals(36, json.get("age").asInt());
        } finally {
            file.delete();
        }
    }

    @Test
    void serialise_givenUnannotatedObject_throwsIllegalArgumentException() {
        JsonSerializer serializer = new JsonSerializer();

        assertThrows(IllegalArgumentException.class, () -> serializer.serialize(new Object()));
    }
}
