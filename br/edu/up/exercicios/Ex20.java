package br.edu.up.exercicios;
// A escola “APRENDER” faz o pagamento de seus professores por hora/aula. Faça um programaque calcule e exiba o salário de um professor. Sabe-se que o valor da hora/aula segue a tabelaabaixo:Professor Nível 1 R$12,00 por hora/aulaProfessor Nível 2 R$17,00 por hora/aulaProfessor Nível 3 R$25,00 por hora/aula


import br.edu.up.models.Professor20;
import br.edu.up.Prompt;

public class Ex20 {
    public static void executar(){

        Professor20 professor = new Professor20();

        professor.setNivel(Prompt.lerInteiro("Informe o nível do professor (1, 2 ou 3): "));

        professor.setHorasAula(Prompt.lerInteiro("Informe a quantidade de horas/aula ministradas: "));

        professor.getValorHoraAula();


        double salario = professor.calcularSalario();

        System.out.println("O salário do professor é: R$" + salario);


    }

}
