package br.edu.up.exercicios;
// Ler 80 números e ao final informar quantos número(s) est(á)ão no intervalo entre 10 (inclusive)e 150 (inclusive).

import br.edu.up.models.IntervaloNumerico;
import br.edu.up.Prompt;

public class Ex09 {
    public static void executar(){
       

        int n = 0;
        IntervaloNumerico[] numerico = new IntervaloNumerico[10];
        
        for(int i = 0; i < 10; i++){
            System.out.println("Informe o " + (i+1) + "º número: ");
            numerico[i] = new IntervaloNumerico();
            numerico[i].setNumero(Prompt.lerInteiro());
            if(numerico[i].getNumero() >= 10 && numerico[i].getNumero() <= 150){
                n++;
            }
        }

        System.out.println("Quantidade de números no intervalo [10, 150] " + n);  //ERRO NA DECLARAÇÃO DO VETOR DA CLASSE INTERVALONUMERICO

         
        

        



        
    }

}
