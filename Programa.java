import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Lista de Exercicios 3 - CLASSES, MÉTODOS E PACOTES");
        System.out.println("----------------------------------------------------------");

        int n;

        System.out.println("Informe o numero da atividade que deseja rodar: 1 à 26");
        n = Prompt.lerInteiro();

        do {
            switch (n) {
                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                case 1:
                    System.out.println("Exercicio 01");
                    Ex01.executar();
                    break;

                case 2:
                    System.out.println("Exercicio 02");
                    Ex02.executar();
                    break;

                case 3:
                    System.out.println("Exercicio 03");
                    Ex03.executar();
                    break;

                case 4:
                    System.out.println("Exercicio 04");
                    Ex04.executar();
                    break;

                case 5:
                    System.out.println("Exercicio 05");
                    Ex05.executar();
                    break;

                case 6:
                    System.out.println("Exercicio 06");
                    Ex06.executar();
                    break;

                case 7:
                    System.out.println("Exercicio 07");
                    Ex07.executar();
                    break;

                case 8:
                    System.out.println("Exercicio 08");
                    Ex08.executar();
                    break;

                case 9:
                    System.out.println("Exercicio 09");
                    Ex09.executar();
                    break;

                case 10:
                    System.out.println("Exercicio 10");
                    Ex10.executar();

                    break;

                case 11:
                    System.out.println("Exercicio 11");
                    Ex11.executar();
                    break;

                case 12:
                    System.out.println("Exercicio 12");
                    Ex12.executar();
                    break;

                case 13:
                    System.out.println("Exercicio 13");
                    Ex13.executar();
                    break;

                case 14:
                    System.out.println("Exercicio 14");
                    Ex14.executar();
                    break;

                case 15:
                    System.out.println("Exercicio 15");
                    Ex15.executar();
                    break;

                case 16:
                    System.out.println("Exercicio 16");
                    Ex16.executar();
                    break;

                case 17:
                    System.out.println("Exercicio 17");
                    Ex17.executar();
                    break;

                case 18:
                    System.out.println("Exercicio 18");
                    Ex18.executar();
                    break;

                case 19:
                    System.out.println("Exercicio 19");
                    Ex19.executar();
                    break;

                case 20:
                    System.out.println("Exercicio 20");
                    Ex20.executar();
                    break;

                case 21:
                    System.out.println("Exercicio 21");
                    Ex21.executar();
                    break;

                case 22:
                    System.out.println("Exercicio 22");
                    Ex22.executar();
                    break;

                case 23:
                    System.out.println("Exercicio 23");
                    Ex23.executar();
                    break;

                case 24:
                    System.out.println("Exercicio 24");
                    Ex24.executar();
                    break;

                case 25:
                    System.out.println("Exercicio 25");
                    Ex25.executar();
                    break;

                case 26:
                    System.out.println("Exercicio 26");
                    Ex26.executar();
                    break;

                default:
                    System.out.println("Informe um numero de 1 à 26!");
                    n = 0;
                    break;
            }
        } while (n != 0);

        leitor.close();
    }

}
