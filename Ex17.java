// Leia o nome do funcionário, seu salário e o valor do salário mínimo. Calcule o seu novo salárioreajustado. Escrever o nome do funcionário, o reajuste e seu novo salário. Calcule quanto àempresa vai aumentar sua folha de pagamento.

import java.util.Scanner;

public class Ex17 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor do salário mínimo: ");
        double salarioMinimo = Prompt.lerDecimal();

        double aumentoFolhaPagamento = 0;

        while (true) {
            System.out.print("Digite o nome do funcionário (ou digite '0' para sair): ");
            String nome = Prompt.lerLinha();

            if (nome.equals("0")) {
                break;
            }

            System.out.print("Digite o salário do funcionário: ");
            double salario = Prompt.lerDecimal();

            Funcionario17 funcionario = new Funcionario17(nome, salario, salarioMinimo);
            funcionario.calcularNovoSalario();

            aumentoFolhaPagamento += funcionario.getSalario() - salario;
        }

        System.out.println("Aumento total na folha de pagamento: " + aumentoFolhaPagamento);

        leitor.close();
    }

}
