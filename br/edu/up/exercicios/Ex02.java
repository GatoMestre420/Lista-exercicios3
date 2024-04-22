package br.edu.up.exercicios;
// 2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida adistância total percorrida pelo automóvel e o total de combustível gasto.

import br.edu.up.models.Automovel;
import br.edu.up.Prompt;

public class Ex02 {
    public static void executar() {

        Automovel carro = new Automovel();
        System.out.println("Informe a Distância percorrida: ");
        carro.setDistancia(Prompt.lerDecimal());
        System.out.println("Informe o total de combustivel gasto: ");
        carro.setTotalCombustivelGasto(Prompt.lerDecimal());
        System.out.println("O Consumo médio de gasolina é de " + carro.calcConsumoMedio() + " KM por Litro");

    }

}
