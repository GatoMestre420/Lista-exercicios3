package br.edu.up.exercicios;
// Dado o nome de um estudante, com o respectivo número de matrícula e as três notas acimamencionadas, desenvolva um programa para calcular a nota final e a classificação de cadaestudante. A classificação é dada conforme a lista abaixo:Nota Final Classificação[8,10] A[7,8] B[6,7] C[5,6] D[0,5] RImprima o nome do estudante, com o seu número, nota final e classificação


import br.edu.up.models.Estudante25;
import br.edu.up.Prompt;

public class Ex25 {
    public static void executar() {
        

        // Criando objeto Estudante com os dados informados
        Estudante25 estudante = new Estudante25();

        // Leitura dos dados do estudante
        System.out.print("Digite o nome do estudante: ");
        estudante.setNome(Prompt.lerLinha());

        System.out.print("Digite o número de matrícula do estudante: ");
        estudante.setNumeroMatricula(Prompt.lerInteiro());

        System.out.print("Digite a nota do trabalho de laboratório (0 a 10): ");
        estudante.setNotaLaboratorio(Prompt.lerDecimal());

        System.out.print("Digite a nota da avaliação semestral (0 a 10): ");
        estudante.setNotaAvaliacaoSemestral(Prompt.lerDecimal());

        System.out.print("Digite a nota do exame final (0 a 10): ");
        estudante.setNotaExameFinal(Prompt.lerDecimal());

        // Calculando a nota final e classificação do estudante
        double notaFinal = estudante.calcularNotaFinal();
        String classificacao = estudante.classificarNota();

        // Exibindo os dados do estudante
        System.out.println("\nNome do estudante: " + estudante.getNome());
        System.out.println("Número de matrícula: " + estudante.getNumeroMatricula());
        System.out.println("Nota final: " + estudante.getNotaExameFinal());
        System.out.println("Classificação: " + classificacao);

    
    }

}
