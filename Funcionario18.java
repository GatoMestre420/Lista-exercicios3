public class Funcionario18 {

    private String nome;
    private int idade;
    private char sexo;
    private double salarioFixo;

    public Funcionario18(String nome, int idade, char sexo, double salarioFixo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.salarioFixo = salarioFixo;
    }

    public double calcularSalarioLiquido() {
        double abono;

        if (idade >= 30 && sexo == 'F') {
            abono = 200;
        } else if (idade >= 30 && sexo == 'M') {
            abono = 150;
        } else {
            abono = 100;
        }

        return salarioFixo + abono;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioLiquido() {
        return calcularSalarioLiquido();
    }

}
