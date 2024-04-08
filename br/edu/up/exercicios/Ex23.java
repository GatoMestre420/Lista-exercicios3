package br.edu.up.exercicios;
// Faça um programa que leia o nome, o sexo, a altura e a idade de uma pessoa. Calcule e mostrenome e o seu peso ideal de acordo com as seguintes características da pessoa:

import java.util.Scanner;

import br.edu.up.models.Pessoa23;
import br.edu.up.models.Prompt;

public class Ex23 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);
    
    
    
        // Leitura dos dados da pessoa
        System.out.print("Digite o nome da pessoa: ");
        String nome = Prompt.lerLinha();

        System.out.print("Digite o sexo da pessoa (M/F): ");
        char sexo = leitor.next().charAt(0);

        System.out.print("Digite a altura da pessoa (em metros): ");
        double altura = Prompt.lerDecimal();

        System.out.print("Digite a idade da pessoa: ");
        int idade = Prompt.lerInteiro();

        // Criando objeto Pessoa com os dados informados
        Pessoa23 pessoa = new Pessoa23(nome, sexo, altura, idade);

        // Calculando e exibindo o peso ideal da pessoa
        double pesoIdeal = pessoa.calcularPesoIdeal();
        System.out.println("\nNome: " + pessoa.getNome());
        System.out.println("Peso ideal: " + pesoIdeal + " kg");
    
    
    
    
        leitor.close();
    }

}
