package br.edu.up.exercicios;
// 7. O custo ao consumidor de um carro novo é a soma do custo de fábrica com a percentagem dodistribuidor e dos impostos (aplicados, primeiro os impostos sobre o custo de fábrica, e depois apercentagem do distribuidor sobre o resultado). Supondo que a percentagem do distribuidor sejade 28% e os impostos 45%. Escrever um programa que leia o custo de fábrica de um carro e informeo custo ao consumidor do mesmo.

import br.edu.up.models.Carro;
import br.edu.up.Prompt;

public class Ex07 {
    public static void executar(){
      

        Carro carro = new Carro();

        System.out.println("informe o custo de fabrica do carro: ");
        carro.setCustoDeFabrica(Prompt.lerDecimal());

        System.out.println("Custo de fabrica: " + String.format("%.2f",carro.getCustoDeFabrica()));
        System.out.println("Custo Final: " + String.format("%.2f", carro.calcCustoFinal()));





       
    }

}
