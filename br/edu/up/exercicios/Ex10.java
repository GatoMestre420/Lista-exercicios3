package br.edu.up.exercicios;
// Faça um programa que receba a idade de um número finito de pessoas e mostre mensageminformando “maior de idade” e “menor de idade” para cada pessoa. Considerar a pessoa com 18anos como maior de idade

import br.edu.up.models.Pessoas;
import br.edu.up.Prompt;

public class Ex10 {
    public static void executar(){
       
        

        

        Pessoas[] pessoas = new Pessoas[(Prompt.lerInteiro("Quantas pessoas você deseja verificar?"))];

        

        for (int i = 0; i < pessoas.length; i++) {
            System.out.println("Informe a idade da pessoa " + (i + 1) + ": ");
            pessoas[i]= new Pessoas();
            pessoas[i].setIdade(Prompt.lerInteiro());
        }

        System.out.println("Resultados:");
        for (int i = 0; i < pessoas.length; i++) {
            System.out.print("Pessoa " + (i + 1) + ": ");
            if (pessoas[i].getIdade() >= 18) {
                System.out.println("Maior de idade");
            } else {
                System.out.println("Menor de idade");
            }
        }
    }

      
}



