package com.pruebas.proyecto.nivell1.exercici1.model;

public class OnSiteWorker extends Worker {
    private static double petrol = 15d;

    public OnSiteWorker(String name, String surname, double priceHour, double petrol) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(int totalHoursMonth) {
        return super.getPriceHour() * totalHoursMonth + petrol;
    }
}
