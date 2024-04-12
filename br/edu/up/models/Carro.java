package br.edu.up.models;
// 7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem dodistribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois apercentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor sejade 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informeo custo ao consumidor do mesmo.

public class Carro {

    private double custoDeFabrica;
    private double percentDistribuidor = 0.28;
    private double impostos = 0.45;


    

    public double getCustoDeFabrica() {
        return custoDeFabrica;
    }




    public double getPercentDistribuidor() {
        return percentDistribuidor;
    }




    public double getImpostos() {
        return impostos;
    }


    

    public void setCustoDeFabrica(double custoDeFabrica) {
        this.custoDeFabrica = custoDeFabrica;
    }




    public void setPercentDistribuidor(double percentDistribuidor) {
        this.percentDistribuidor = percentDistribuidor;
    }




    public void setImpostos(double impostos) {
        this.impostos = impostos;
    }




    public double calcCustoFinal(){

        double y = custoDeFabrica + (custoDeFabrica * impostos);
        double custoFinal = y + (y * percentDistribuidor);
        return(custoFinal);
    }

}
