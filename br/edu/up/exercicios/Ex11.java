package br.edu.up.exercicios;
// Escrever um programa que leia o nome e o sexo de 56 pessoas e informe o nome e se ela éhomem ou mulher. No final informe total de homens e de mulheres

import java.util.Scanner;
import br.edu.up.models.Pessoas11;
import br.edu.up.Prompt;

public class Ex11 {
    public static void executar() {
        Scanner leitor = new Scanner(System.in);

        Pessoas11[] pessoas = new Pessoas11[10];
        int totalHomens = 0;
        int totalMulheres = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe o nome da pessoa " + (i + 1) + ": ");
            pessoas[i].setNome(Prompt.lerLinha());

            System.out.println("informe o sexo da pessoa (M/F) " + (i + 1) + ": ");
            pessoas[i].setSexo(Prompt.lerLinha());
            Prompt.lerLinha(); // limpar o buffer do scanner;

            if (pessoas[i].getSexo().equals("m") || pessoas[i].getSexo().equals("M")) {
                totalHomens++;
            } else if (pessoas[i].getSexo().equals("f") || pessoas[i].getSexo().equals("F")) {
                totalMulheres++;
            }
        }

        System.out.println("RESULTADOS:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Nome: " + pessoas[i].getNome() + ", Sexo: ");
            if (pessoas[i].getSexo().equals("M") || pessoas[i].getSexo().equals("m")) {
                System.out.println("HOMEM");
            } else if (pessoas[i].getSexo().equals("f") || pessoas[i].getSexo().equals("F")) {
                System.out.println("MULHER");
            }
        }

        System.out.println("Total de Homens: " + totalHomens);
        System.out.println("Total de Mulheres: " + totalMulheres);

        leitor.close();
    }

}
