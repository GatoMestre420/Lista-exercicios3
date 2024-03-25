// Elabore um programa que, dada a idade de um nadador. Classifique-o em uma das seguintescategorias:Infantil A = 5 - 7 anosInfantil B = 8 - 10 anosjuvenil A = 11- 13 anosjuvenil B = 14 - 17 anosSênior = 18 - 25 anosApresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado

import java.util.Scanner;

public class Ex21 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a idade do nadador: ");
        int idade = leitor.nextInt();

        Nadador21 nadador = new Nadador21(idade);
        String categoria = nadador.classificarCategoria();

        System.out.println("O nadador está na categoria: " + categoria);


        leitor.close();
    }

}
