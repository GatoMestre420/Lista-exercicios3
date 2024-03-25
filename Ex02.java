// 2. Escrever um programa para determinar o consumo médio de um automóvel sendo fornecida adistância total percorrida pelo automóvel e o total de combustível gasto.

public class Ex02 {
    public static void executar() {

        Automovel carro = new Automovel();
        System.out.println("Informe a Distância percorrida: ");
        carro.distancia = Prompt.lerDecimal();
        System.out.println("Informe o total de combustivel gasto: ");
        carro.totalCombustivelGasto = Prompt.lerDecimal();

        System.out.println("O Consumo médio de gasolina é de " + carro.calcConsumoMedio() + "KM por Litro");

    }

}
