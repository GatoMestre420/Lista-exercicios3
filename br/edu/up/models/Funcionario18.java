package br.edu.up.models;
public class Funcionario18 {

    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double calcularSalarioLiquido() {
        double abono;

        if (idade >= 30 && sexo == 'F') {
            abono = 200;
        } else if (idade >= 30 && sexo == 'M') {
            abono = 150;
        } else {
            abono = 100;
        }

        return salarioFixo + abono;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioLiquido() {
        return calcularSalarioLiquido();
    }

}
