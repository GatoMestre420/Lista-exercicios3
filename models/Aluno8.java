package br.edu.up.models;
public class Aluno8 {

    public String nome;
    public double nota1;
    public double nota2;
    public double nota3;
    public double media;

    public double calcMedia(){

        media = (nota1 + nota2 + nota3)/3;
        return(media);
    
    }
        
    public String toString(){
        
        if(media >= 7){
            return  "Aluno: " + nome + " MÉDIA: " + media + " APROVADO!";
        }if (media > 5.1 && media < 6.9) {
            return "Aluno: " + nome + " MÉDIA: " + media + " RECUPERAÇÃO!";
            
        } else {
            return "Aluno: " + nome + " MÉDIA: " + media + " REPROVADO!";
        }
    }

}
