package br.edu.up.models;
public class ContaLuz22 {

    private double valorKWh;
    private double consumo;

    

    public double getValorKWh() {
        return valorKWh;
    }

    public void setValorKWh(double valorKWh) {
        this.valorKWh = valorKWh;
    }

    public double getConsumo() {
        return consumo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public ContaLuz22(double valorKWh, double consumo) {
        this.valorKWh = valorKWh;
        this.consumo = consumo;
    }

    public double calcularValorConta() {
        return valorKWh * consumo;
    }

}
