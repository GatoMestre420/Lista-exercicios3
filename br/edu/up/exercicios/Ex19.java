package br.edu.up.exercicios;
// Escrever um programa que leia três valores inteiros e verifique se eles podem ser os lados deum triângulo. Se forem, informar qual o tipo de triângulo que eles formam: equilátero, isóscele ouescaleno.Propriedade: o comprimento de cada lado de um triângulo é menor do que a soma doscomprimentos dos outros dois lados.Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais. Portanto, todotriângulo equilátero é também isóscele;Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes.

import br.edu.up.Prompt;
import br.edu.up.models.Triangulo19;

public class Ex19 {
    public static void executar(){
        

        Triangulo19 triangulo = new Triangulo19();

        System.out.println("Digite os três lados do triângulo:");
        System.out.print("Lado 1: ");
        triangulo.setLado1((Prompt.lerInteiro()));
        System.out.print("Lado 2: ");
        triangulo.setLado2((Prompt.lerInteiro())); 
        System.out.print("Lado 3: ");
        triangulo.setLado3((Prompt.lerInteiro()));

        
        String tipoTriangulo = triangulo.verificarTipoTriangulo();

        System.out.println("O triângulo é do tipo: " + tipoTriangulo);

        
    }

}
