package br.edu.up.exercicios;
// Escrever um programa que leia os dados de “N” pessoas (nome, sexo, idade e saúde) e informese está apta ou não para cumprir o serviço militar obrigatório. Informe os totais.


import br.edu.up.models.Pessoa13;
import br.edu.up.Prompt;

public class Ex13 {
    public static void executar(){
        
        Pessoa13 pessoa = new Pessoa13();

        System.out.print("Quantas pessoas deseja verificar? ");
        int numPessoas = Prompt.lerInteiro();
        

        int totalAptos = 0;
        int totalHomens = 0;

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("\nInforme os dados da pessoa " + (i + 1) + ":");

            System.out.print("Nome: ");
            pessoa.setNome(Prompt.lerLinha());

            System.out.print("Sexo (M/F): ");
            pessoa.setSexo(Prompt.lerLinha().charAt(0));
            

            System.out.print("Idade: ");
            pessoa.setIdade(Prompt.lerInteiro());
            

            System.out.print("Saúde (1 = Saudavel/ 0 = Não Saudavel : ");
            pessoa.setSaude(Prompt.lerLinha());
            

            

            if (pessoa.estaApto() == "1") {
                totalAptos++;
            }

            if (pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm') {
                totalHomens++;
            }
        }

        System.out.println("\nTotal de pessoas aptas para o serviço militar: " + totalAptos);
        System.out.println("Total de homens: " + totalHomens);


    }

}
