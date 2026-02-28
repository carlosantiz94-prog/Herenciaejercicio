package com.example;

public class BuqueCarga extends Transporte {
    private String tipoOceano;

    public BuqueCarga(String marca, double capacidadCarga, String tipoOceano) {
        super(marca, capacidadCarga);
        this.tipoOceano = tipoOceano;
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tipo: Buque | Océano: " + tipoOceano);
    }
}
