package br.edu.up.models;
public class Funcionario17 {

    private String nome;
    private double salario;
    private double salarioMinimo;

    public Funcionario17(String nome, double salario, double salarioMinimo) {
        this.nome = nome;
        this.salario = salario;
        this.salarioMinimo = salarioMinimo;
    }

    public void calcularNovoSalario() {
        double reajuste;

        if (salario < 3 * salarioMinimo) {
            reajuste = salario * 0.5;
        } else if (salario >= 3 * salarioMinimo && salario <= 10 * salarioMinimo) {
            reajuste = salario * 0.2;
        } else if (salario > 10 * salarioMinimo && salario <= 20 * salarioMinimo) {
            reajuste = salario * 0.15;
        } else {
            reajuste = salario * 0.1;
        }

        salario += reajuste;

        System.out.println("Nome: " + nome);
        System.out.println("Reajuste: " + reajuste);
        System.out.println("Novo salário: " + salario);
    }

    public double getSalario() {
        return salario;
    }

}
