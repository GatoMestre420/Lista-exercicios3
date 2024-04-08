package br.edu.up.exercicios;
// A concessionária de veículos “CARANGO” está vendendo os seus veículos com desconto. Façaum programa que calcule e exiba o valor do desconto e o valor a ser pago pelo cliente. O descontodeverá ser calculado sobre o valor do veículo de acordo com o combustível (álcool – 25%, gasolina– 21% ou diesel –14%). Com valor do veículo zero encerra entrada de dados. Informe total dedesconto e total pago pelos clientes

import java.util.Scanner;

import br.edu.up.models.Prompt;
import br.edu.up.models.Veiculo15;

public class Ex15 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        double totalDesconto = 0.0;
        double totalPago = 0.0;

        while (true) {
            System.out.print("Informe o tipo de combustível (álcool/gasolina/diesel) ou digite '0' para encerrar: ");
            String combustivel = Prompt.lerLinha();

            if (combustivel.equals("0")) {
                break; // Encerra a entrada de dados se o combustível for zero
            }

            System.out.print("Informe o valor do veículo: ");
            double valor = Double.parseDouble(leitor.nextLine());

            Veiculo15 veiculo = new Veiculo15(combustivel, valor);
            double desconto = veiculo.calcularDesconto();
            totalDesconto += desconto;
            totalPago += veiculo.getValorComDesconto();

            System.out.println("Valor do desconto: " + desconto);
            System.out.println("Valor a ser pago pelo cliente: " + veiculo.getValorComDesconto());
        }

        System.out.println("\nTotal de desconto: " + totalDesconto);
        System.out.println("Total pago pelos clientes: " + totalPago);








        leitor.close();
    }

}
