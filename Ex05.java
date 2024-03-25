//5 - A Loja Mamão com Açúcar está vendendo seus produtos em 5 (cinco) prestações sem juros.Faça um programa que receba um valor de uma compra e mostre o valor das prestações

import java.util.Scanner;

public class Ex05 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Compra05 produto = new Compra05();
        System.out.println("Informe o valor da compra: ");
        produto.valor = Prompt.lerDecimal();

        System.out.println("O valor das 5 prestações fica: " + produto.calcPrest());







        leitor.close();
    }

}
