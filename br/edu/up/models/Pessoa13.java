package br.edu.up.models;
public class Pessoa13 {

    private String nome;
    private char sexo;
    private int idade;
    private String saude;

    public Pessoa13(String nome, char sexo, int idade, String saude) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.saude = saude;
    }

    

    public Pessoa13() {
    }



    public Pessoa13(int idade, String saude) {
        this.idade = idade;
        this.saude = saude;
    }



    public String estaApto(int idade, String saude) {
        if(idade >= 18 && saude == 1){
            return("Está apto");
        }else{
            return ("Não está apto");
        }
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

    public String getSaude() {
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

    public void setSaude(String saude) {
        this.saude = saude;
    }

    

}
