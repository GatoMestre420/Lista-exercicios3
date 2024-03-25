// 1. Escrever um programa que leia o nome de um aluno e as notas das três provas que ele obteveno semestre. No final informar o nome do aluno e a sua média (aritmética).


public class Ex01 {
    public static void executar() {

        Aluno novoAluno = new Aluno();
        novoAluno.nome = "Luan";
        Aluno nota1 = new Aluno();
        Aluno nota2 = new Aluno();
        Aluno nota3 = new Aluno();


        System.out.println("informe o nome do aluno: ");
        novoAluno.nome = Prompt.lerLinha();
        System.out.println("Informe a primeira nota do aluno: ");
        novoAluno.nota1 = Prompt.lerDecimal();
        System.out.println("Informe a segunda nota do aluno ");
        novoAluno.nota2 = Prompt.lerDecimal();
        System.out.println("Informe a terceira nota do aluno:  ");
        novoAluno.nota3 = Prompt.lerDecimal();

        double media = novoAluno.calcularMedia();        

        System.out.println("A média do aluno " + novoAluno.nome + " é " + novoAluno.calcularMedia());


    }

}
