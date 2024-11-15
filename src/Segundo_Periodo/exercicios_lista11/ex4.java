package Segundo_Periodo.exercicios_lista11;/*
Dado o vetor = { 85, 45, 41 ,22, 11, 0, 99, 78, 35, 101, 71, 8, -1, 45}, faça um
procedimento utilizando Bubble Sort para ordenar o vetor.
 */

import java.util.Arrays;

public class ex4 {
    public static void main(String[] args){
        int[] vetor = new int[]{85, 45, 41 ,22, 11, 0, 99, 78, 35, 101, 71, 8, -1, 45};

        bubble_sort(vetor);

        System.out.println(Arrays.toString(vetor));

    }

    static int[] bubble_sort(int[] vetor){
        int aux = 0;

        for (int i = 0; i < vetor.length - 1; i++){
            for (int j = 0; j < vetor.length - 1; j++){
                if (vetor[j+1] < vetor[j]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                }
            }
        }

        return vetor;

    }


}
