package Terceiro_Periodo.lista_ex2;

import java.util.Arrays;

public class ex14 {
    public static void main(String[] args) {
        int[] vetor = new int[]{1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(vetor));
        System.out.println(Arrays.toString(reverse_vetor(vetor)));
    }

    public static int[] reverse_vetor(int[] vetor) {
        int[] reverse_vetor = new int[vetor.length];
        int counter = 0;

        for (int i = vetor.length - 1; i >= 0; i--) {
            reverse_vetor[counter] = vetor[i];
            counter++;
        }
        return reverse_vetor;
    }

}
