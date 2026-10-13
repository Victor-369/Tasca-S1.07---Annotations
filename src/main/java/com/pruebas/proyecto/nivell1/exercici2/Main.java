package com.pruebas.proyecto.nivell1.exercici2;

import com.pruebas.proyecto.nivell1.exercici2.model.OnSiteWorker;
import com.pruebas.proyecto.nivell1.exercici2.model.OnlineWorker;

public class Main {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        OnlineWorker onlineWorker = new OnlineWorker("Ada", "Lovelace", 20d);
        OnSiteWorker onSiteWorker = new OnSiteWorker("Alan", "Turing", 25d);

        System.out.println(onlineWorker.calculateSalaryIncludingInternetAllowance(160, 30));
        System.out.println(onSiteWorker.calculateSalaryIncludingPetrolAllowance(160, 15));
    }
}
