// Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostreo nome e o salário líquido acrescido do abono conforme o sexo e a idade

import java.util.Scanner;

public class Ex18 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        String nome = Prompt.lerLinha();

        System.out.print("Digite a idade do funcionário: ");
        int idade = Prompt.lerInteiro();

        System.out.print("Digite o sexo do funcionário (M/F): ");
        char sexo = leitor.next().charAt(0);

        System.out.print("Digite o salário fixo do funcionário: ");
        double salarioFixo = Prompt.lerDecimal();

        Funcionario18 funcionario = new Funcionario18(nome, idade, sexo, salarioFixo);

        System.out.println("\nNome do funcionário: " + funcionario.getNome());
        System.out.println("Salário líquido acrescido do abono: " + funcionario.getSalarioLiquido());











        leitor.close();
    }

}
