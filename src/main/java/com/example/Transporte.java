package com.example;

public class Transporte {
    // Atributos protegidos (protected) para que las clases hijas puedan usarlos
    protected String marca;
    protected double capacidadCarga;

    public Transporte(String marca, double capacidadCarga) {
        this.marca = marca;
        this.capacidadCarga = capacidadCarga;
    }

    public void mostrarInfo() {
        System.out.println("Transporte Marca: " + marca + " | Capacidad: " + capacidadCarga + " toneladas");
    }
}