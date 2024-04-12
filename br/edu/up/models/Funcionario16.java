package br.edu.up.models;
public class Funcionario16 {

    private double salario;
    private final double salarioMinimo = 1100; // Valor do salário mínimo

    public Funcionario16(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void aplicarReajuste() {
        if (salario < 3 * salarioMinimo) {
            salario *= 1.5; // Reajuste de 50%
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            salario *= 1.2; // Reajuste de 20%
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            salario *= 1.15; // Reajuste de 15%
        } else {
            salario *= 1.1; // Reajuste de 10%
        }
    }

}
