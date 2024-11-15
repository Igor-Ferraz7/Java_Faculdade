package Segundo_Periodo.exercicios_lista8;/*
Dada a sequência de números: 3 4 9 2 5 8 2 1 7 4 6 2 9 8 5 1 6 8 0 4 11 77 34 0 -5 4 ,
ordene-a em ordem não decrescente segundo os seguintes algoritmos, apresentando a
sequência obtida após cada passo do algoritmo:
a. Bubble Sort
b. Selection Sort
c. Insertion Sort
 */

import java.util.Arrays;

public class ex1c {
    public static void main(String[] args){
        int[] vetor = new int[]{3, 4, 9, 2, 5, 8 ,2, 1, 7, 4, 6, 2, 9, 8, 5, 1, 6, 8, 0, 4, 11, 77, 34, 0, -5, 4};
        int aux, min, j;

        for (int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            for (j = i - 1; j >= 0 && vetor[j] > aux; j--){
                vetor[j+1] = vetor[j];
            }
            vetor[j+1] = aux;
        }

        System.out.print(Arrays.toString(vetor));

    }
}
