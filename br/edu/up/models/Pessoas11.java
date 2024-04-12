package br.edu.up.models;
public class Pessoas11 {
    
    private String nome;
    private char sexo;

    public Pessoas11(String nome, char sexo){
        this.nome = nome;
        this.sexo = sexo;
    }

    public String getNome(){
        return nome;
    }

    public char getSexo(){
        return sexo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    

}
