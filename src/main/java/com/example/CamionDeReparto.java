package com.example;

public class CamionDeReparto extends Transporte {

    private boolean tieneRefrigeracion;

    public CamionDeReparto(String idTransporte, double combustible, double capacidadCarga, boolean tieneRefrigeracion) {
        super(idTransporte, combustible, capacidadCarga);
        this.tieneRefrigeracion = tieneRefrigeracion;
    }

    // Sobrescritura del método viajar
    @Override
    public void viajar(int distancia) {
        double consumo;

        if (tieneRefrigeracion) {
            consumo = (distancia / 10.0) * 2; // Doble consumo
        } else {
            consumo = distancia / 10.0;
        }

        setCombustible(getCombustible() - consumo);
    }
}
