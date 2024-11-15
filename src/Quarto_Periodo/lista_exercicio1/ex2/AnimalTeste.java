package Quarto_Periodo.lista_exercicio1.ex2;

public class AnimalTeste {
    public static void main(String[] args) {
        Peixe Tilapia = new Peixe("a", 1.0, "b");
        Cachorro Zezinho = new Cachorro("a", 1.0, "b");

        Tilapia.setNome("Tilapia");
        Tilapia.setPeso(10.5);
        Tilapia.setTipoHabitat("Represas");

        Zezinho.setNome("Zezinho");
        Zezinho.setPeso(17.5);
        Zezinho.setRaca("Bulldog");

        System.out.println("Peixe:");
        System.out.printf("Nome: %s | Peso: %.2f | Tipo de Habitat: %s\n", Tilapia.getNome(), Tilapia.getPeso(), Tilapia.getTipoHabitat());

        System.out.println("Cachorro:");
        System.out.printf("Nome: %s | Peso: %.2f | Ra�a: %s\n", Zezinho.getNome(), Zezinho.getPeso(), Zezinho.getRaca());

    }
}
