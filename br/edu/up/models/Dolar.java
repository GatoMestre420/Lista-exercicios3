package br.edu.up.models;
public class Dolar { 

    private double quant;
    private double valorCot;

    public double getQuant(){
        return quant;
    }

    public double getValorCot(){
        return valorCot;
    }

    public void setQuant(Double quant){
        this.quant = quant;
    }

    public void setValorCot(Double valorCot){
        this.valorCot = valorCot;
    }

    public double calcCot(){
        return quant * valorCot;
    }

}
