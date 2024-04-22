package br.edu.up.exercicios;
// A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos comdesconto. Faça um programa que calcule e exiba o valor do desconto e o valor a ser pago pelocliente de vários carros. O desconto deverá ser calculado de acordo com o ano do veículo. Até 2000- 12% e acima de 2000 - 7%. O sistema deverá perguntar se deseja continuar calculando descontoaté que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e total geral.


import br.edu.up.models.Carro12;
import br.edu.up.Prompt;

public class Ex12 {
    public static void executar(){

        int totalCarrosAte2000 = 0;
        int totalGeral = 0;
        char continuar;

        Carro12 carros = new Carro12();

        do {
            System.out.print("Informe o ano do carro: ");
            carros.setAno(Prompt.lerInteiro());

            System.out.print("Informe o preço do carro: ");
            carros.setPreco(Prompt.lerDecimal());

            if (carros.getAno() <= 2000) {
                totalCarrosAte2000++;
            }

            System.out.println("Valor do desconto: " + carros.calcularDesconto());
            System.out.println("Valor a ser pago pelo cliente: " + carros.getPrecoComDesconto());

            totalGeral++;

            System.out.print("Deseja continuar calculando desconto? (S/N): ");
            continuar = Character.toUpperCase(Prompt.lerLinha().charAt(0));
        } while (continuar == 'S');

        System.out.println("Total de carros com ano até 2000: " + totalCarrosAte2000);
        System.out.println("Total geral de carros: " + totalGeral);

    }

}
