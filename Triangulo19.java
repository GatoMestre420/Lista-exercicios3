public class Triangulo19 {

    private int lado1, lado2, lado3;

    public Triangulo19(int lado1, int lado2, int lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
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
