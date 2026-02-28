package com.example;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // 1️⃣ Instanciación
        CamionDeReparto camion = new CamionDeReparto("CAM001", 80, 5000, true);
        BuqueCarga buque = new BuqueCarga("BUQ001", 90, 20000, 50);

        // 2️⃣ Prueba de fuego (Validación)
        camion.setCombustible(-20);
        System.out.println("Combustible actual del camión: " + camion.getCombustible());
        // Debe mostrar 0

        // 3️⃣ Polimorfismo
        ArrayList<Transporte> flota = new ArrayList<>();
        flota.add(camion);
        flota.add(buque);

        System.out.println("\n--- Viaje de 100 km ---");

        for (Transporte t : flota) {
            t.viajar(100);
            t.mostrarDatos();
            System.out.println("---------------------");
        }

        // Método exclusivo del buque
        buque.atracarEnPuerto();
    }
}