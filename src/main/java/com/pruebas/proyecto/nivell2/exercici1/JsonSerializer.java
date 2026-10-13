package com.pruebas.proyecto.nivell2.exercici1;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonSerializer {

    public File serialize(Object object) throws IOException {
        JsonSerializable annotation = object.getClass().getAnnotation(JsonSerializable.class);

        if (annotation == null) {
            throw new IllegalArgumentException("The class is not annotated with @JsonSerializable");
        }

        File directory = new File(annotation.destinationDirectory());
        directory.mkdirs();

        File file = new File(directory, object.getClass().getSimpleName() + ".json");

        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(file, object);

        return file;
    }
}
