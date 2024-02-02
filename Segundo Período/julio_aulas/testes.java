package julio_aulas;

import java.util.Arrays;
import java.util.Scanner;

public class testes {
    static Scanner input = new Scanner(System.in);
    static int[][] vector;
    static StringBuilder formated_matriz = new StringBuilder();

    public static void main(String[] args) {
        int[][] matriz = {
                {25,50},{20,30},{30,40},{20,65},{20,40},{18,60},{30,45},{18,65}
        };

        quicksort(matriz, 0, matriz.length - 1);

        formated_matriz.append('[');
        for (int i = 0; i < matriz.length; i++) {
            String vector = Arrays.toString(matriz[i]);
            formated_matriz.append(vector);

            if (i+1 == matriz.length) {
                formated_matriz.append(']').toString();
                break;
            } else {
                formated_matriz.append(", ");
            }
        }

        System.out.println(formated_matriz);

    }

    static void quicksort(int[][] vetor, int esquerda, int direita){
        if (esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }
    }

    static int particao(int[][] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio][0];
        int pivot_weight = vetor[meio][1];
        int i = esquerda - 1;
        int j = direita + 1;

        while(true){
            do {
                i++;
            } while (vetor[i][0] < pivot || (vetor[i][0] == pivot && vetor[i][1] < pivot_weight));
            do {
                j--;
            } while (vetor[j][0] > pivot || (vetor[j][0] == pivot && vetor[j][1] > pivot_weight));
            if (i >= j) {
                return j;
            }

            int aux_age = vetor[i][0];
            int aux_weight = vetor[i][1];

            vetor[i][0] = vetor[j][0];
            vetor[j][0] = aux_age;
            vetor[i][1] = vetor[j][1];
            vetor[j][1] = aux_weight;
        }
    }

}