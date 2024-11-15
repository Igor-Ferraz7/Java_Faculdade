package Terceiro_Periodo.lista_ex2;

public class ex15 {
    public static void main(String[] args) {
        String[] vetor = new String[]{"Oi", "Igor", "Sousa", "!"};
        odd_positions(vetor);
    }

    public static String[] odd_positions(String[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            if (i % 2 == 1) {
                System.out.println(vetor[i]);
            }
        }

        return vetor;

    }

}
