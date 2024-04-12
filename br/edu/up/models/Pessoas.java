package br.edu.up.models;
import java.util.Scanner;

class Pessoas {
    int idade;

    public Pessoas(int idade) {
        this.idade = idade;
    }

    public void verificarIdade() {
        if (idade >= 18) {
            System.out.println("Maior de idade");
        } else {
            System.out.println("Menor de idade");
        }
    }
}