package br.edu.up.exercicios;
// Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostrecomo resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço decusto e do preço de venda

import br.edu.up.models.Produto14;
import br.edu.up.Prompt;

public class Ex14 {
    public static void executar(){

        Produto14[] produtos = new Produto14[5];

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        for (int i = 0; i < 5; i++){

            produtos[i] = new Produto14();

            System.out.println("Informe o preço de custo do produto " + (i + 1) + ": ");
            produtos[i].setPrecoCusto(Prompt.lerDecimal());

            System.out.println("Informe o preço de venda do produto " + (i + 1) + ": ");
            produtos[i].setPrecoVenda(Prompt.lerDecimal());

            

            somaPrecoCusto += produtos[i].getPrecoCusto();
            somaPrecoVenda += produtos[i].getPrecoVenda();
        }

        double mediaPrecoCusto = somaPrecoCusto / 5;
        double mediaPrecoVenda = somaPrecoVenda / 5;

        System.out.println("\nResultados:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Produto " + (i + 1) + ": ");
            System.out.println(produtos[i].calcularResultado());
        }

        System.out.println("\nMédia de preço de custo: " + mediaPrecoCusto);
        System.out.println("Média de preço de venda: " + mediaPrecoVenda);


    }

}
