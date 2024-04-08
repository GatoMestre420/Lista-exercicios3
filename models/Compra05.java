package br.edu.up.models;
public class Compra05 {

    private double valor;

    

    public double getValor() {
        return valor;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }

    public double calcPrest(){
        return valor / 5;
    }

}
