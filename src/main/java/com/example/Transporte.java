package com.example;

public class Transporte {

    // Atributos privados
    private String idTransporte;
    private double combustible;
    private double capacidadCarga;

    // Constructor
    public Transporte(String idTransporte, double combustible, double capacidadCarga) {
        this.idTransporte = idTransporte;
        setCombustible(combustible);
        setCapacidadCarga(capacidadCarga);
    }

    // Getter
    public double getCombustible() {
        return combustible;
    }

    public String getIdTransporte() {
        return idTransporte;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    // Setter con lógica
    public void setCombustible(double nivel) {
        if (nivel < 0) {
            this.combustible = 0;
        } else if (nivel > 100) {
            this.combustible = 100;
        } else {
            this.combustible = nivel;
        }
    }

    public void setCapacidadCarga(double carga) {
        if (carga < 0) {
            System.out.println("Error: La capacidad de carga no puede ser negativa.");
        } else {
            this.capacidadCarga = carga;
        }
    }

    // Método viajar (1 unidad cada 10km)
    public void viajar(int distancia) {
        double consumo = distancia / 10.0;
        setCombustible(this.combustible - consumo);
    }

    // Método mostrar información básica
    public void mostrarDatos() {
        System.out.println("ID: " + idTransporte);
        System.out.println("Combustible: " + combustible);
        System.out.println("Capacidad de Carga: " + capacidadCarga);
    }
}