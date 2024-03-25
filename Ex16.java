// Escrever um programa para uma empresa que decide dar um reajuste a seus 584 funcionáriosde acordo com os seguintes critérios:a) 50% para aqueles que ganham menos do que três salários mínimos;b) 20% para aqueles que ganham entre três até dez salários mínimos;c) 15% para aqueles que ganham acima de dez até vinte salários mínimos;d) 10% para os demais funcionários

import java.util.Scanner;

public class Ex16 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        Funcionario16[] funcionarios = new Funcionario16[584];
        double totalSalarios = 0;

        // Inicializando os salários dos funcionários aleatoriamente (para fins de teste)
        for (int i = 0; i < 584; i++) {
            double salario = Math.random() * 25000 + 1100; // Salário entre 1 e 25 salários mínimos
            funcionarios[i] = new Funcionario16(salario);
            totalSalarios += salario;
        }

        // Aplicando o reajuste para cada funcionário
        for (Funcionario16 funcionario : funcionarios) {
            funcionario.aplicarReajuste();
        }

        // Calculando o total de salários após o reajuste
        double totalSalariosReajustados = 0;
        for (Funcionario16 funcionario : funcionarios) {
            totalSalariosReajustados += funcionario.getSalario();
        }

        System.out.println("Total de salários antes do reajuste: " + totalSalarios);
        System.out.println("Total de salários após o reajuste: " + totalSalariosReajustados);
    
        leitor.close();
    }    
}

