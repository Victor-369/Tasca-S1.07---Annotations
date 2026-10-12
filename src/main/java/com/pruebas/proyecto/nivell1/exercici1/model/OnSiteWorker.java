package com.pruebas.proyecto.nivell1.exercici1.model;

public class OnSiteWorker extends Worker {
    private static double petrol = 15d;

    public OnSiteWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    public double getPetrol() {
        return petrol;
    }

    @Override
    public double calculateSalary(int totalHoursMonth) {
        return super.getPriceHour() * totalHoursMonth + petrol;
    }
}
