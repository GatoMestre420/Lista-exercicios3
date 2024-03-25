// Faça um programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculoda conta de luz segue a tabela abaixo:Tipo de Cliente Valor do KW/h1 (Residência) 0,602 (Comércio) 0,483 (Indústria) 1,29

import java.util.Scanner;

public class Ex22 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);


        
        System.out.println("Selecione o tipo de cliente:");
        System.out.println("1. Residência");
        System.out.println("2. Comércio");
        System.out.println("3. Indústria");
        System.out.print("Opção: ");
        int tipoCliente = Prompt.lerInteiro();

        double valorKWh;
        switch (tipoCliente) {
            case 1:
                valorKWh = 0.602;
                break;
            case 2:
                valorKWh = 0.483;
                break;
            case 3:
                valorKWh = 1.29;
                break;
            default:
                System.out.println("Opção inválida. Encerrando o programa.");
                return;
        }

        System.out.print("Informe o consumo em kWh: ");
        double consumo = Prompt.lerDecimal();

        ContaLuz22 contaLuz = new ContaLuz22(valorKWh, consumo);
        double valorConta = contaLuz.calcularValorConta();

        System.out.println("O valor da conta de luz é: R$" + valorConta);

        leitor.close();
    }

}
