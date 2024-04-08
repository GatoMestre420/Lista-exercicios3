package br.edu.up.models;
public class Pessoa13 {

    private String nome;
    private char sexo;
    private int idade;
    private boolean saude;

    public Pessoa13(String nome, char sexo, int idade, boolean saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    public boolean estaApto() {
        return idade >= 18 && saude;
    }

    public char getSexo() {
        return sexo;
    }

}
