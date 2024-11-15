package lista_exercicio1.ex2;

public class Cachorro extends Animal{
    private String raca;

    public Cachorro(String nome, Double peso, String raca) {
        super(nome, peso);
        this.raca = raca;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
}
