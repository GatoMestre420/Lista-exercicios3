package br.edu.up.exercicios;
// Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela éhomem ou mulher. No final informe total de homens e de mulheres

import java.util.Scanner;

import br.edu.up.models.Pessoas11;
import br.edu.up.models.Prompt;

public class Ex11 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
        
        Pessoas11[] pessoas = new Pessoas11[10];
        int totalHomens = 0;
        int totalMulheres = 0;

        for(int i = 0; i < 10; i++){
            System.out.println("Informe o nome da pessoa " + (i+1) + ": ");
            pessoas.setNome(Prompt.lerLinha());

            System.out.println("informe o sexo da pessoa (M/F) " + (i+1) + ": ");
            pessoa.setSexo(Prompt.lerLinha());
            Prompt.lerLinha(); //limpar o buffer do scanner;

            Pessoas11[i] = new Pessoas11(nome, sexo);

            if(pessoa.getSexo() == 'M' || pessoa.getSexo() == 'm'){
                totalHomens++;
            }else if(pessoa.getSexo() == 'f' || pessoa.getSexo() == 'F'){
                totalMulheres++;
            }
        }

        System.out.println("RESULTADOS:");
        for(int i = 0; i < 10; i ++){
            System.out.println("Nome: " + pessoas[i].getNome() + ", Sexo: ");
            if(pessoas[i].getSexo() == 'M' || pessoas[i].getSexo() == 'm'){
                System.out.println("HOMEM");
            }else if(pessoas[i].getSexo() == 'f' || pessoas[i].getSexo() == 'F'){
                System.out.println("MULHER");
            }
        }

        System.out.println("Total de Homens: " + totalHomens);
        System.out.println("Total de Mulheres: " + totalMulheres);

        leitor.close();
    }

}
