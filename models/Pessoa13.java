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

    public String getNome() {
        return nome;
    }

    public char getSexo() {
        return sexo;
    }

    public int getIdade() {
        return idade;
    }

    public boolean getSaude() {
        return saude;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setSaude(boolean saude) {
        this.saude = saude;
    }

    

}
