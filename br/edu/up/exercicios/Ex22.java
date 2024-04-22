package br.edu.up.exercicios;
// Faça um programa que calcule o valor da conta de luz de uma pessoa. Sabe-se que o cálculoda conta de luz segue a tabela abaixo:Tipo de Cliente Valor do KW/h1 (Residência) 0,602 (Comércio) 0,483 (Indústria) 1,29


import br.edu.up.models.ContaLuz22;
import br.edu.up.Prompt;

public class Ex22 {
    public static void executar(){


        
        System.out.println("Selecione o tipo de cliente:");
        System.out.println("1. Residência");
        System.out.println("2. Comércio");
        System.out.println("3. Indústria");
        System.out.print("Opção: ");
        int tipoCliente = Prompt.lerInteiro();

        double valorKWh;
        double consumo = 0;

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
        ContaLuz22 contaLuz = new ContaLuz22(valorKWh, consumo);

        System.out.print("Informe o consumo em kWh: ");
        contaLuz.setConsumo(Prompt.lerDecimal());

        
        double valorConta = contaLuz.calcularValorConta();

        contaLuz.setValorKWh(Prompt.lerDecimal("O valor da conta de luz é: R$" + valorConta));

    }

}
