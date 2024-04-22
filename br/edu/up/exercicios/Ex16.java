package br.edu.up.exercicios;

import br.edu.up.models.Funcionario16;

public class Ex16 {
    public static void executar() {
        Funcionario16[] funcionarios = new Funcionario16[584];
        double totalSalarios = 0;

        for (int i = 0; i < 584; i++) {
            funcionarios[i] = new Funcionario16();
            funcionarios[i].setSalario(Math.random() * 25000 + 1100); 
            totalSalarios += funcionarios[i].getSalario();

        }

        for (int i = 0; i < 584; i++) {
            funcionarios[i].aplicarReajuste();
        }

        double totalSalariosReajustados = 0;
        for (int i = 0; i < 584; i++) {
            totalSalariosReajustados += funcionarios[i].getSalario();
        }

        System.out.println("Total de salários antes do reajuste: " + totalSalarios);
        System.out.println("Total de salários após o reajuste: " + totalSalariosReajustados);
    }
}
