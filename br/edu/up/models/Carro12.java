package br.edu.up.models;
public class Carro12 {

    private int ano;
    private double preco;


    public double calcularDesconto() {
        if (ano <= 2000) {
            return preco * 0.12;
        } else {
            return preco * 0.07;
        }
    }

    public double getPrecoComDesconto() {
        return preco - calcularDesconto();
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    

}


