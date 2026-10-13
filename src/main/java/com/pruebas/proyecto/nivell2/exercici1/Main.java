package com.pruebas.proyecto.nivell2.exercici1;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Person person = new Person("Ada Lovelace", 36);

        JsonSerializer serializer = new JsonSerializer();
        File file = serializer.serialize(person);

        System.out.println("JSON saved to " + file.getPath());
    }
}
