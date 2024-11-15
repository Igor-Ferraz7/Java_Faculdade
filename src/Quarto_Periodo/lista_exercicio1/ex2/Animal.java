package Quarto_Periodo.lista_exercicio1.ex2;

public class Animal {
    private String nome;
    private Double peso;

    public Animal(String nome, Double peso) {
        this.nome = nome;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
