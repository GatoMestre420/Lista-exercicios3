package br.edu.up.exercicios;
// Uma seguradora possui nove categorias de seguro baseadas na idade e ocupação do segurado.Somente pessoas com pelo menos 17 anos e não mais que 70 anos podem adquirir apólices deseguro. Quanto às classes de ocupações, foram definidos três grupos de risco: baixo, médio e alto.A tabela abaixo fornece as categorias em função da faixa etária e do grupo de risco. Dados nome,idade e grupo de risco de um pretendente, determinar e imprimir seus dados e categoria. Caso aidade não esteja na faixa necessária, imprimir uma mensagem informando que ele não se enquadraem nenhuma das categorias ofertadas


import br.edu.up.models.Pretendente26;
import br.edu.up.Prompt;

public class Ex26 {
    public static void executar(){

        Pretendente26 pretendente = new Pretendente26();

        System.out.print("Digite o nome do pretendente: ");
        pretendente.setNome(Prompt.lerLinha());

        System.out.print("Digite a idade do pretendente: ");
        pretendente.setIdade(Prompt.lerInteiro());


        System.out.print("Digite o grupo de risco (baixo, médio ou alto): ");
        pretendente.setGrupoRisco(Prompt.lerLinha());

      
        String categoria = pretendente.determinarCategoria();

        System.out.println("\nNome: " + pretendente.getNome());
        System.out.println("Idade: " + pretendente.getIdade());
        System.out.println("Grupo de risco: " + pretendente.getGrupoRisco());
        System.out.println("Categoria de seguro: " + categoria);

    }



}
