package br.edu.up.models;
public class Produto6 {

    private double precoCusto;
    private double valorVenda;
    private double acrescimo;

    
    public double getPrecoCusto() {
        return precoCusto;
    }

    public void setPrecoCusto(double precoCusto) {
        this.precoCusto = precoCusto;
    }

    public double getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(double valorVenda) {
        this.valorVenda = valorVenda;
    }

    public double getAcrescimo() {
        return acrescimo;
    }

    public void setAcrescimo(double acrescimo) {
        this.acrescimo = acrescimo;
    }

    public double calcValorDeVenda(){

        valorVenda = precoCusto * ( 1 + acrescimo/100);
        return(valorVenda);
    }

    
}
