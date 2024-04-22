package br.edu.up.exercicios;

import br.edu.up.models.Aluno8;
import br.edu.up.Prompt;

public class Ex08 {
    public static void executar(){
        
        java.util.Locale.setDefault(java.util.Locale.US);

        Aluno8 aluno = new Aluno8();

        System.out.println("Informe o nome: ");
        aluno.setNome(Prompt.lerLinha()) ;
        System.out.println("Informe a primeira nota: ");
        aluno.setNota1(Prompt.lerDecimal()) ;
        System.out.println("Informe a segunda nota: ");
        aluno.setNota2(Prompt.lerDecimal()) ;
        System.out.println("Informe a terceira nota: ");
        aluno.setNota3(Prompt.lerDecimal());
        Double media = (aluno.getNota1()+aluno.getNota2()+aluno.getNota3())/3;
        

        if(media >= 7){
            Prompt.imprimir("Aluno: " + aluno.getNome() + " MÉDIA: " + media + " APROVADO!");
        }else if (media > 5.1 && media < 6.9) {
            Prompt.imprimir("Aluno: " + aluno.getNome() + " MÉDIA: " + media + " RECUPERAÇÃO!");
            
        } else {
            Prompt.imprimir("Aluno: " + aluno.getNome() + " MÉDIA: " + media + " REPROVADO!");
        }
    }
}
