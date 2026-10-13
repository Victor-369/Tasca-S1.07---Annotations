package com.pruebas.proyecto.nivell1.exercici2.model;

public class OnSiteWorker extends Worker {
    private static double petrolPrice = 15d;

    public OnSiteWorker(String name, String surname, double priceHour) {
        super(name, surname, priceHour);
    }

    @Override
    public double calculateSalary(int totalHoursMonth) {
        return super.calculateSalary(totalHoursMonth) + petrolPrice;
    }

    /**
     * @deprecated Use {@link #calculateSalary(int)} instead.
     */
    @Deprecated
    public double calculateSalaryIncludingPetrolAllowance(int totalHoursMonth, double newPetrolPrice) {
        return (super.getPriceHour() *  totalHoursMonth) + newPetrolPrice;
    }
}
