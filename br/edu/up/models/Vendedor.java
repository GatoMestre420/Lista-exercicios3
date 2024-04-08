package br.edu.up.models;
public class Vendedor {

    public String nome;
    public double salarioFix;
    public double totalVendas;

    public double calcSalario(){

        return salarioFix + (totalVendas * 0.15);
    }

}
