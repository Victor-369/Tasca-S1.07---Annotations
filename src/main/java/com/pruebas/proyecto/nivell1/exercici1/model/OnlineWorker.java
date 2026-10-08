package com.pruebas.proyecto.nivell1.exercici1.model;

public class OnlineWorker extends Worker {
    private static double flatRateInternet =  30d;

    public OnlineWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(int totalHoursMonth) {
        return super.getPriceHour() * totalHoursMonth + flatRateInternet;
    }
}
