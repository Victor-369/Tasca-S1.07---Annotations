package com.pruebas.proyecto.nivell1.exercici1.model;

public class Worker {
    private String name;
    private String surname;
    private double priceHour;

    public Worker(String name, String surname, double priceHour) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("Name cannot be null or blank");
        }

        if (surname == null || surname.isBlank()) {
            throw new IllegalArgumentException("Surname cannot be null or blank");
        }

        if (priceHour < 0) {
            throw new IllegalArgumentException("Price per hour cannot be negative");
        }

        this.name = name;
        this.surname = surname;
        this.priceHour = priceHour;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public double getPriceHour() {
        return priceHour;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", priceHour=" + priceHour +
                '}';
    }

    public double calculateSalary(int totalHours) {
        if (totalHours < 0) {
            throw new IllegalArgumentException("Total hours cannot be negative");
        }

        return this.priceHour * totalHours;
    }
}
