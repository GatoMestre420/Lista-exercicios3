package br.edu.up.exercicios;
// 6. Faça um programa que receba o preço de custo de um produto e mostre o valor de venda. Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelousuário.

import br.edu.up.models.Produto6;
import br.edu.up.Prompt;

public class Ex06 {
    public static void executar(){
        

        Produto6 produto = new Produto6();

        System.out.println("Informe o preço do produto: ");
        produto.precoCusto = Prompt.lerDecimal();
        System.out.println("Informe o Percentual de acrescimo: ");
        produto.acrescimo = Prompt.lerDecimal();
        
        System.out.println("O valor final de venda desse produto é de: " + produto.calcValorDeVenda());






        
    }

}
