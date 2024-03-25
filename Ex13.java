// Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informese está apta ou não para cumprir o serviço militar obrigatório. Informe os totais.

import java.util.Scanner;

public class Ex13 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);


        System.out.print("Quantas pessoas deseja verificar? ");
        int numPessoas = Prompt.lerInteiro();
        leitor.nextLine(); // Limpar o buffer do scanner

        int totalAptos = 0;
        int totalHomens = 0;

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("\nInforme os dados da pessoa " + (i + 1) + ":");

            System.out.print("Nome: ");
            String nome = Prompt.lerLinha();

            System.out.print("Sexo (M/F): ");
            char sexo = leitor.next().charAt(0);
            leitor.nextLine(); // Limpar o buffer do scanner

            System.out.print("Idade: ");
            int idade = Prompt.lerInteiro();
            leitor.nextLine(); // Limpar o buffer do scanner

            System.out.print("Saúde (true/false): ");
            boolean saude = leitor.nextBoolean();
            leitor.nextLine(); // Limpar o buffer do scanner

            Pessoa13 pessoa = new Pessoa13(nome, sexo, idade, saude);

            if (pessoa.estaApto()) {
                totalAptos++;
            }

            if (pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm') {
                totalHomens++;
            }
        }

        System.out.println("\nTotal de pessoas aptas para o serviço militar: " + totalAptos);
        System.out.println("Total de homens: " + totalHomens);


        leitor.close();
    }

}
