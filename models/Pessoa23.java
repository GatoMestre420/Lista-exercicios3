package br.edu.up.models;
public class Pessoa23 {
    private String nome;
    private char sexo;
    private double altura;
    private int idade;

    public Pessoa23(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public double calcularPesoIdeal() {
        double pesoIdeal;
        if (sexo == 'M') { // Para homens
            pesoIdeal = 22 * (altura * altura);
        } else { // Para mulheres
            pesoIdeal = 21 * (altura * altura);
        }
        return pesoIdeal;
    }

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public double getAltura() {
        return altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    

}
