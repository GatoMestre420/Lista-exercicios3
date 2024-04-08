package br.edu.up.exercicios;

import br.edu.up.models.Aluno;
import br.edu.up.models.Prompt;

public class Ex08 {
    public static void executar(){
        
        java.util.Locale.setDefault(java.util.Locale.US);

        Aluno aluno = new Aluno();

        System.out.println("Informe o nome: ");
        aluno.nome = Prompt.lerLinha();
        System.out.println("Informe a primeira nota: ");
        aluno.nota1 = Prompt.lerDecimal();
        System.out.println("Informe a segunda nota: ");
        aluno.nota2 = Prompt.lerDecimal();
        System.out.println("Informe a terceira nota: ");
        aluno.nota3 = Prompt.lerDecimal();

        System.out.println();
        System.out.println(aluno.toString()); // ERRO NO toString tirar a dúvida na sala!






        
    }

}
