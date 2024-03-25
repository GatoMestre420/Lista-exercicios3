// 3. Escrever um programa que leia o nome de um vendedor, o seu salário fixo e o total de vendasefetuadas por ele no mês (em dinheiro). Sabendo que este vendedor ganha 15% de comissão sobresuas vendas efetuadas, informar o seu nome, o salário fixo e salário no final do mês

public class Ex03 {
    public static void executar() {

        Vendedor vendedor = new Vendedor();

        System.out.println("informe o nome do vendedor: ");
        vendedor.nome = Prompt.lerLinha();
        System.out.println("Informe o salario fixo :");
        vendedor.salarioFix = Prompt.lerDecimal();
        System.out.println("Informe o total de vendas do vendedor: ");
        vendedor.totalVendas = Prompt.lerDecimal();

        System.out.println("Nome: " + vendedor.nome);
        System.out.println("Salario fixo: " + vendedor.salarioFix);
        System.out.println("Total de vendas: " + vendedor.totalVendas);
        System.out.println("Salario final: " + vendedor.calcSalario());

    }

}
