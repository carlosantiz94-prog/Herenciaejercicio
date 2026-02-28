package com.example;

public class Main {
    public static void main(String[] args) {
        // Creamos un camión
        CamionDeReparto miCamion = new CamionDeReparto("Volvo", 20.5, 3);
        
        // Creamos un buque
        BuqueCarga miBuque = new BuqueCarga("Maersk", 50000, "Atlántico");

        System.out.println("--- SISTEMA DE LOGÍSTICA ---");
        miCamion.mostrarInfo();
        System.out.println("----------------------------");
        miBuque.mostrarInfo();
    }
}