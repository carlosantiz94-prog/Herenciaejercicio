package com.example;

public class BuqueCarga extends Transporte {

    private int cantidadContenedores;

    public BuqueCarga(String idTransporte, double combustible, double capacidadCarga, int cantidadContenedores) {
        super(idTransporte, combustible, capacidadCarga);
        this.cantidadContenedores = cantidadContenedores;
    }

    public void atracarEnPuerto() {
        System.out.println("El buque " + getIdTransporte() + " está listo para descarga.");
    }

    public void mostrarDatos() {
        super.mostrarDatos();
        System.out.println("Cantidad de Contenedores: " + cantidadContenedores);

        // Cálculo del costo del viaje (ejemplo)
        double costoViaje = cantidadContenedores * 50; // (50)100 USD por contenedor
        System.out.println("Costo del viaje: $" + costoViaje + " USD");
    }
}
