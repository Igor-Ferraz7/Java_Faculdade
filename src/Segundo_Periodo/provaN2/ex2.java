package Segundo_Periodo.provaN2;

import java.util.Arrays;

public class ex2 {
    public static void main(String[] args) {
        int[] vetor = new int[]{5, 1, 4, 2, 8, 11, 0, 25, 38, 41, 55};
        bubble_sort(vetor);
    }
    static void bubble_sort(int[] vetor) {
        int aux;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < vetor.length - 1; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        System.out.println(Arrays.toString(vetor));
    }
}
    


