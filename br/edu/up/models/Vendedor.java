package br.edu.up.models;
public class Vendedor {

    private String nome;
    private double salarioFix;
    private double totalVendas;

    // Getters ----------------------

    public String getNome() {
        return nome;
    }

    public double getSalarioFix() {
        return salarioFix;
    }

    public double getTotalVendas() {
        return totalVendas;
    }


    // Setters ---------------------

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalarioFix(double salarioFix) {
        this.salarioFix = salarioFix;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    public double calcSalario(){

        return salarioFix + (totalVendas * 0.15);
    }

    

}
