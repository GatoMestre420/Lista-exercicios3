// Faça um programa que receba o preço de custo e o preço de venda de 40 produtos. Mostrecomo resultado se houve lucro, prejuízo ou empate para cada produto. Informe média de preço decusto e do preço de venda

import java.util.Scanner;

public class Ex14 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Produto14[] produtos = new Produto14[5];

        double somaPrecoCusto = 0;
        double somaPrecoVenda = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o preço de custo do produto " + (i + 1) + ": ");
            double precoCusto = Prompt.lerDecimal();

            System.out.println("Informe o preço de venda do produto " + (i + 1) + ": ");
            double precoVenda = Prompt.lerDecimal();

            produtos[i] = new Produto14(precoCusto, precoVenda);

            somaPrecoCusto += precoCusto;
            somaPrecoVenda += precoVenda;
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

        leitor.close();
    }

}
