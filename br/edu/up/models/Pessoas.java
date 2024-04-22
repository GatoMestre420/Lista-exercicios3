package br.edu.up.models;


    public class Pessoas {
    private int idade;
    private int numPessoas;

    

    

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }



    public int getIdade() {
        return idade;
    }



    public void setIdade(int idade) {
        this.idade = idade;
    }



    public int getNumPessoas() {
        return numPessoas;
    }



    public void setNumPessoas(int numPessoas) {
        this.numPessoas = numPessoas;
    }
}