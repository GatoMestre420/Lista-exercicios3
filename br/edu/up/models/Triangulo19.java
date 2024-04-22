package br.edu.up.models;
public class Triangulo19 {

    private int lado1, lado2, lado3;

    public Triangulo19(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    

    public int getLado1() {
        return lado1;
    }



    public int getLado2() {
        return lado2;
    }



    public int getLado3() {
        return lado3;
    }



    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }



    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }



    public void setLado3(int lado3) {
        this.lado3 = lado3;
    }



    public Triangulo19() {
    }



    public String verificarTipoTriangulo() {
        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                return "Equilátero";
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                return "Isóscele";
            } else {
                return "Escaleno";
            }
        } else {
            return "Não forma um triângulo";
        }
    }

}
