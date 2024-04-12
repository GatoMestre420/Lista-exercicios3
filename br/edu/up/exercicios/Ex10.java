package br.edu.up.exercicios;
// Faça um programa que receba a idade de um número finito de pessoas e mostre mensageminformando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18anos como maior de idade

import br.edu.up.models.Pessoas;
import br.edu.up.Prompt;

public class Ex10 {
    public static void executar(){
       
        
        System.out.println("Quantas pessoas você deseja verificar?");
        int numPessoas = Prompt.lerInteiro();

        Pessoas[] pessoas = new Pessoas[numPessoas];

        for (int i = 0; i < numPessoas; i++) {
            System.out.println("Informe a idade da pessoa " + (i + 1) + ": ");
            int idade = Prompt.lerInteiro();
            pessoas[i] = new Pessoas(idade);
        }

        System.out.println("Resultados:");
        for (int i = 0; i < numPessoas; i++) {
            System.out.print("Pessoa " + (i + 1) + ": ");
            pessoas[i].verificarIdade();
        }

      
    }

}

