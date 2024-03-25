public class Produto6 {

    public double precoCusto;
    public double valorVenda;
    public double acrescimo;
    

    public double calcValorDeVenda(){

        valorVenda = precoCusto * ( 1 + acrescimo/100);
        return(valorVenda);
    }

    
}
