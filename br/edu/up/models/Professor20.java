package br.edu.up.models;

public class Professor20 {

    private int nivel;
    private double valorHoraAula;
    private int horasAula;

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
        setValorHoraAula(nivel); // Call the method to set the hourly rate when the level is set
    }

    public double getValorHoraAula() {
        return valorHoraAula;
    }

    private void setValorHoraAula(int nivel) { // Change return type to void
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

    public double calcularSalario() {
        return horasAula * valorHoraAula;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }
}