package br.edu.up.models;
public class Pretendente26 {

    private String nome;
    private int idade;
    private String grupoRisco;

    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setGrupoRisco(String grupoRisco) {
        this.grupoRisco = grupoRisco;
    }

    public Pretendente26() {
        
    }

    public String determinarCategoria() {
        if (idade < 17 || idade > 70) {
            return "Não se enquadra em nenhuma categoria";
        }

        if (idade >= 17 && idade <= 30) {
            if (grupoRisco.equals("baixo")) {
                return "Categoria 1";
            } else if (grupoRisco.equals("médio")) {
                return "Categoria 2";
            } else if (grupoRisco.equals("alto")) {
                return "Categoria 3";
            }
        } else if (idade >= 31 && idade <= 50) {
            if (grupoRisco.equals("baixo")) {
                return "Categoria 4";
            } else if (grupoRisco.equals("médio")) {
                return "Categoria 5";
            } else if (grupoRisco.equals("alto")) {
                return "Categoria 6";
            }
        } else if (idade >= 51 && idade <= 70) {
            if (grupoRisco.equals("baixo")) {
                return "Categoria 7";
            } else if (grupoRisco.equals("médio")) {
                return "Categoria 8";
            } else if (grupoRisco.equals("alto")) {
                return "Categoria 9";
            }
        }

        return "Não se enquadra em nenhuma categoria";
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getGrupoRisco() {
        return grupoRisco;
    }

}
