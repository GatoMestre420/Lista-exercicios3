// 4. Elaborar um programa que efetue a apresentação do valor da conversão em real (R$) de umvalor lido em dólar (US$). O programa deverá solicitar o valor da cotação do dólar e também aquantidade de dólares disponíveis com o usuário

import java.util.Scanner;

public class Ex04 {
    public static void executar(){
       

        Dolar dollar = new Dolar();

        System.out.println("Infome o valor da cotação do dollar: ");
        dollar.valorCot = Prompt.lerDecimal();
        System.out.println("Informe a quantidade para conversão : ");
        dollar.quant = Prompt.lerDecimal();

        System.out.println("O valor de $" + dollar.quant + " em reais é: " + dollar.calcCot() + "R$");




        
    }

}
