package br.edu.up.models;

public class Automovel {

    private double distancia;
    private double totalCombustivelGasto;

    public double calcConsumoMedio() {
        return (distancia / totalCombustivelGasto);
    }

    public Automovel() {
    }

    // Getters
    public double getDistancia() {
        return distancia;
    }

    public double getTotalCombustivelGasto() {
        return totalCombustivelGasto;
    }

    // Setters

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    public void setTotalCombustivelGasto(double totalCombustivelGasto) {
        this.totalCombustivelGasto = totalCombustivelGasto;
    }
}
