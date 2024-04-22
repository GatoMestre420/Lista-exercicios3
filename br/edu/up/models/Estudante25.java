package br.edu.up.models;
public class Estudante25 {

    private String nome;
    private int numeroMatricula;
    private double notaLaboratorio;
    private double notaAvaliacaoSemestral;
    private double notaExameFinal;


    
    public Estudante25() {
    }

    public Estudante25(String nome, int numeroMatricula, double notaLaboratorio, double notaAvaliacaoSemestral, double notaExameFinal) {
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
        this.notaLaboratorio = notaLaboratorio;
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
        this.notaExameFinal = notaExameFinal;
    }

    public double calcularNotaFinal() {
        double notaFinal = (notaLaboratorio * 2 + notaAvaliacaoSemestral * 3 + notaExameFinal * 5) / 10;
        return notaFinal;
    }

    public String classificarNota() {
        double notaFinal = calcularNotaFinal();
        if (notaFinal >= 8) {
            return "A";
        } else if (notaFinal >= 7) {
            return "B";
        } else if (notaFinal >= 6) {
            return "C";
        } else if (notaFinal >= 5) {
            return "D";
        } else {
            return "R";
        }
    }

    public String getNome() {
        return nome;
    }

    public int getNumeroMatricula() {
        return numeroMatricula;
    }

    public double getNotaLaboratorio() {
        return notaLaboratorio;
    }

    public double getNotaAvaliacaoSemestral() {
        return notaAvaliacaoSemestral;
    }

    public double getNotaExameFinal() {
        return notaExameFinal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumeroMatricula(int numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public void setNotaLaboratorio(double notaLaboratorio) {
        this.notaLaboratorio = notaLaboratorio;
    }

    public void setNotaAvaliacaoSemestral(double notaAvaliacaoSemestral) {
        this.notaAvaliacaoSemestral = notaAvaliacaoSemestral;
    }

    public void setNotaExameFinal(double notaExameFinal) {
        this.notaExameFinal = notaExameFinal;
    }

    


}
