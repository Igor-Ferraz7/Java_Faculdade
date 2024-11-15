package Terceiro_Periodo.provaN2;

import java.util.Arrays;
import java.util.Random;

public class ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetor = new int[50];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(50);
        }

        System.out.println("Desordenado:");
        System.out.println(Arrays.toString(vetor));

        vetor = selection_sort(vetor);

        System.out.println("Ordenado:");
        System.out.println(Arrays.toString(vetor));

    }

    static int[] selection_sort(int[] vetor) {
        int aux = 0;
        int min = 0;

        for (int i = 0; i < vetor.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }

            aux = vetor[min];
            vetor[min] = vetor[i];
            vetor[i] = aux;
        }

        return vetor;

    }

}
