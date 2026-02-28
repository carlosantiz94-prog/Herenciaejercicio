package com.example;

public class CamionDeReparto extends Transporte {
    private int numeroEjes;

    public CamionDeReparto(String marca, double capacidadCarga, int numeroEjes) {
        super(marca, capacidadCarga); // Llama al constructor de Transporte
        this.numeroEjes = numeroEjes;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo(); // Imprime la info básica
        System.out.println("Tipo: Camión | Ejes: " + numeroEjes);
    }
}
