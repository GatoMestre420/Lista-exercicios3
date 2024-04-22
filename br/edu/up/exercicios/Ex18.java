package br.edu.up.exercicios;
// Faça um programa que receba o nome a idade, o sexo e salário fixo de um funcionário. Mostreo nome e o salário líquido acrescido do abono conforme o sexo e a idade


import br.edu.up.models.Funcionario18;
import br.edu.up.Prompt;

public class Ex18 {
    public static void executar(){

        Funcionario18 funcionario = new Funcionario18();


        System.out.print("Digite o nome do funcionário: ");
        funcionario.setNome(Prompt.lerLinha());

        System.out.print("Digite a idade do funcionário: ");
        funcionario.setIdade(Prompt.lerInteiro());

        System.out.print("Digite o sexo do funcionário (M/F): ");
        funcionario.setSexo(Prompt.lerLinha().charAt(0));

        System.out.print("Digite o salário fixo do funcionário: ");
        funcionario.setSalarioFixo(Prompt.lerDecimal());


        System.out.println("\nNome do funcionário: " + funcionario.getNome());
        System.out.println("Salário líquido acrescido do abono: " + funcionario.getSalarioLiquido());

    }

}
