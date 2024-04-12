package br.edu.up.models;
public class Veiculo15 {

    private String combustivel;
    private double valor;

    public Veiculo15(String combustivel, double valor) {
        this.combustivel = combustivel;
        this.valor = valor;
    }


    

    public String getCombustivel() {
        return combustivel;
    }




    public double getValor() {
        return valor;
    }


    


    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }




    public void setValor(double valor) {
        this.valor = valor;
    }




    public double calcularDesconto() {
        if (combustivel.equalsIgnoreCase("álcool")) {
            return valor * 0.25;
        } else if (combustivel.equalsIgnoreCase("gasolina")) {
            return valor * 0.21;
        } else if (combustivel.equalsIgnoreCase("diesel")) {
            return valor * 0.14;
        } else {
            return 0.0; // Se o combustível não estiver entre as opções, não há desconto
        }
    }



}
