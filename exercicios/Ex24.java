package br.edu.up.exercicios;
// Em um curso de Ciência da Computação a nota do estudante é calculada a partir de três notasatribuídas, respectivamente, a um trabalho de laboratório, a uma avaliação semestral e a um examefinal. As notas variam, de 0 a 10 e a nota final é a média ponderada das três notas mencionadas.A lista abaixo fornece os pesos:a. Laboratório: peso 2b. Avaliação semestral: peso 3c. Exame final: peso 5

import java.util.Scanner;

import br.edu.up.models.Estudante24;
import br.edu.up.models.Prompt;

public class Ex24 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        
        // Leitura das notas do estudante
        System.out.print("Digite a nota do trabalho de laboratório (0 a 10): ");
        double notaLaboratorio = Prompt.lerDecimal();

        System.out.print("Digite a nota da avaliação semestral (0 a 10): ");
        double notaAvaliacaoSemestral = Prompt.lerDecimal();

        System.out.print("Digite a nota do exame final (0 a 10): ");
        double notaExameFinal = Prompt.lerDecimal();

        // Criando objeto Estudante com as notas informadas
        Estudante24 estudante = new Estudante24(notaLaboratorio, notaAvaliacaoSemestral, notaExameFinal);

        // Calculando e exibindo a nota final do estudante
        double notaFinal = estudante.calcularNotaFinal();
        System.out.println("\nA nota final do estudante é: " + notaFinal);






        leitor.close();
    }

}
