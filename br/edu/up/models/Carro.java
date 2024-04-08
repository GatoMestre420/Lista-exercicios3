package br.edu.up.models;
// 7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem dodistribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois apercentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor sejade 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informeo custo ao consumidor do mesmo.

public class Carro {

    public double custoDeFabrica;
    public double percentDistribuidor = 0.28;
    public double impostos = 0.45;

    public double calcCustoFinal(){

        double y = custoDeFabrica + (custoDeFabrica * impostos);
        double custoFinal = y + (y * percentDistribuidor);
        return(custoFinal);
    }

}
