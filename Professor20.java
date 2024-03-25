public class Professor20 {

    private int nivel;
    private double valorHoraAula;

    public Professor20(int nivel) {
        this.nivel = nivel;
        definirValorHoraAula();
    }

    private void definirValorHoraAula() {
        switch (nivel) {
            case 1:
                valorHoraAula = 12.00;
                break;
            case 2:
                valorHoraAula = 17.00;
                break;
            case 3:
                valorHoraAula = 25.00;
                break;
            default:
                System.out.println("Nível de professor inválido. Definindo valor padrão para R$10,00 por hora/aula.");
                valorHoraAula = 10.00; // Valor padrão caso o nível seja inválido
        }
    }

    public double calcularSalario(int horasAula) {
        return horasAula * valorHoraAula;
    }

}
