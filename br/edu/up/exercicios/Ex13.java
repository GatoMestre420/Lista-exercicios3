package br.edu.up.exercicios;
// Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informese está apta ou não para cumprir o serviço militar obrigatório. Informe os totais.


import br.edu.up.models.Pessoa13;
import br.edu.up.Prompt;

public class Ex13 {
    public static void executar(){


        System.out.print("Quantas pessoas deseja verificar? ");
        int numPessoas = Prompt.lerInteiro();
        int totalAptos = 0;

        
        Pessoa13[] pessoas = new Pessoa13[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            pessoas[i] = new Pessoa13();
            System.out.println("\nInforme os dados da pessoa " + (i + 1) + ":");

            System.out.print("Nome: ");
            pessoas[i].setNome(Prompt.lerLinha());

            System.out.print("Sexo (M/F): ");
            pessoas[i].setSexo(Prompt.lerLinha());
           

            System.out.print("Idade: ");
            pessoas[i].setIdade(Prompt.lerInteiro());

            System.out.print("Saúde (1 = Bom / 2 = Ruim): ");
            pessoas[i].setSaude(Prompt.lerInteiro());

            

            if (pessoas[i].getSaude() == 1 && pessoas[i].getSexo().equals("M") && pessoas[i].getIdade() >= 18) {
                totalAptos++;
            }
            

            
        }

        System.out.println("\nTotal de pessoas aptas para o serviço militar: " + totalAptos);


    }


}
