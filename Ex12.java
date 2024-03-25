// A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos comdesconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelocliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000- 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando descontoaté que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral.

import java.util.Scanner;

public class Ex12 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        int totalCarrosAte2000 = 0;
        int totalGeral = 0;
        char continuar;

        do {
            System.out.print("Informe o ano do carro: ");
            int ano = Prompt.lerInteiro();

            System.out.print("Informe o preço do carro: ");
            double preco = Prompt.lerDecimal();

            Carro12 carro = new Carro12(ano, preco);

            if (carro.getAno() <= 2000) {
                totalCarrosAte2000++;
            }

            System.out.println("Valor do desconto: " + carro.calcularDesconto());
            System.out.println("Valor a ser pago pelo cliente: " + carro.getPrecoComDesconto());

            totalGeral++;

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            continuar = leitor.next().charAt(0);
        } while (continuar == 'S' || continuar == 's');

        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

        leitor.close();
    }

}
