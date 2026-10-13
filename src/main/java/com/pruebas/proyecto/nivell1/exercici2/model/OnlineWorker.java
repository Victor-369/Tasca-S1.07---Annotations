package com.pruebas.proyecto.nivell1.exercici2.model;

public class OnlineWorker extends Worker {
    private static final double FLAT_RATE_INTERNET =  30d;

    public OnlineWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(int totalHoursMonth) {
        return super.calculateSalary(totalHoursMonth) + FLAT_RATE_INTERNET;
    }

    /**
     * @deprecated Use {@link #calculateSalary(int)} instead.
     */
    @Deprecated
    public double calculateSalaryIncludingInternetAllowance(int totalHoursMonth, double newFlatRateInternetPrice) {
        return (super.getPriceHour() *  totalHoursMonth) + newFlatRateInternetPrice;
    }
}
