package br.edu.up.exercicios;
//5 - A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.Faça um programa que receba um valor de uma compra e mostre o valor das prestações

import br.edu.up.models.Compra05;
import br.edu.up.models.Prompt;

public class Ex05 {
    public static void executar(){
        

        Compra05 produto = new Compra05();
        System.out.println("Informe o valor da compra: ");
        produto.setValor(Prompt.lerDecimal());

        System.out.println("O valor das 5 prestações fica: " + produto.calcPrest());







      
    }

}
