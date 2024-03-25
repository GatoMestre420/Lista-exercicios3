public class Pessoa23 {
    private String nome;
    private char sexo;
    private double altura;
    private int idade;

    public Pessoa23(String nome, char sexo, double altura, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.altura = altura;
        this.idade = idade;
    }

    public double calcularPesoIdeal() {
        double pesoIdeal;
        if (sexo == 'M') { // Para homens
            pesoIdeal = 22 * (altura * altura);
        } else { // Para mulheres
            pesoIdeal = 21 * (altura * altura);
        }
        return pesoIdeal;
    }

    public String getNome() {
        return nome;
    }

}
