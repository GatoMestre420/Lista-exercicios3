package br.edu.up.models;
public class Dolar {

    public double quant;
    public double valorCot;

    public double calcCot(){
        return quant * valorCot;
    }

}
