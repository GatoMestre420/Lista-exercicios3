// Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado.Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices deseguro. Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto.A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome,idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. Caso aidade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadraem nenhuma das categorias ofertadas

import java.util.Scanner;

public class Ex26 {
    public static void executar(){
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o nome do pretendente: ");
        String nome = Prompt.lerLinha();

        System.out.print("Digite a idade do pretendente: ");
        int idade = Prompt.lerInteiro();

        leitor.nextLine(); // Limpar o buffer do teclado

        System.out.print("Digite o grupo de risco (baixo, médio ou alto): ");
        String grupoRisco = Prompt.lerLinha();

        Pretendente26 pretendente = new Pretendente26(nome, idade, grupoRisco);
        String categoria = pretendente.determinarCategoria();

        System.out.println("\nNome: " + pretendente.getNome());
        System.out.println("Idade: " + pretendente.getIdade());
        System.out.println("Grupo de risco: " + pretendente.getGrupoRisco());
        System.out.println("Categoria de seguro: " + categoria);

        leitor.close();
    }



}
