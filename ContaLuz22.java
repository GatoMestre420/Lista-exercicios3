public class ContaLuz22 {

    private double valorKWh;
    private double consumo;

    public ContaLuz22(double valorKWh, double consumo) {
        this.valorKWh = valorKWh;
        this.consumo = consumo;
    }

    public double calcularValorConta() {
        return valorKWh * consumo;
    }

}
