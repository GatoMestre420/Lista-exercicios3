package br.edu.up.models;
public class Estudante24 {

    private double notaLaboratorio;
    private double notaAvaliacaoSemestral;
    private double notaExameFinal;

    

    public double getNotaLaboratorio() {
        return notaLaboratorio;
    }

    public void setNotaLaboratorio(double notaLaboratorio) {
        this.notaLaboratorio = notaLaboratorio;
    }

    public double getNotaAvaliacaoSemestral() {
        return notaAvaliacaoSemestral;
    }

    public void setNotaAvaliacaoSemestral(double notaAvaliacaoSemestral) {
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
    }

    public double getNotaExameFinal() {
        return notaExameFinal;
    }

    public void setNotaExameFinal(double notaExameFinal) {
        this.notaExameFinal = notaExameFinal;
    }

    public Estudante24() {
        
    }

    public double calcularNotaFinal() {
        double notaFinal = (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
        return notaFinal;
    }

}
