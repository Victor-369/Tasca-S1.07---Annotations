package com.pruebas.proyecto.nivell1;

import com.pruebas.proyecto.nivell1.exercici1.model.OnSiteWorker;
import com.pruebas.proyecto.nivell1.exercici1.model.OnlineWorker;
import com.pruebas.proyecto.nivell1.exercici1.model.Worker;

public class Main {
    public static void main(String[] args) {
        int totalHours = 10;

        Worker onlineWorker = new OnlineWorker("Elisa", "Thorn", 40);
        Worker onSiteWorker = new OnSiteWorker("John", "Kusiac", 40);

        System.out.println("Working " + totalHours + " hours. This is total salary for: \n");
        System.out.println("Online worker " + onlineWorker.getName() + " " + onlineWorker.getSurname() + ": " + onlineWorker.calculateSalary(totalHours));
        System.out.println("On site worker " + onSiteWorker.getName() + " " + onSiteWorker.getSurname() + ": " + onSiteWorker.calculateSalary(totalHours));
    }
}
