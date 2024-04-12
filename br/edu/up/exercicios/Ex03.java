package br.edu.up.exercicios;
// 3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendasefetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobresuas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês

import br.edu.up.Prompt;
import br.edu.up.models.Vendedor;

public class Ex03 {
    public static void executar() {

        Vendedor vendedor = new Vendedor();

        System.out.println("informe o nome do vendedor: ");
        vendedor.setNome(Prompt.lerLinha());
        System.out.println("Informe o salario fixo :");
        //vendedor.setSalarioFix(Prompt.lerLinha());
        System.out.println("Informe o total de vendas do vendedor: ");
        //vendedor.setTotalVendas(Prompt.lerLinha());

        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Salario fixo: " + vendedor.getSalarioFix());
        System.out.println("Total de vendas: " + vendedor.getTotalVendas());
        //System.out.println("Salario final: " + vendedor.getCalcSalario());

    }

}
