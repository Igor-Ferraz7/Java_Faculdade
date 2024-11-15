package provaN1;

public class ex3 {
    public static void main(String[] args) {
        String[] vetor = new String[]{"Maionese", "Batata", "Pão"};
        inverse_vetor(vetor, vetor.length-1);
    }

    public static void inverse_vetor(String[] vetor, int pos) {
        if (pos >= 0) {
            System.out.print(vetor[pos] + ", ");
            inverse_vetor(vetor, pos-1);
        }
    }
}
