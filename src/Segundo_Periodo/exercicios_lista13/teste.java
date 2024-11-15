package Segundo_Periodo.exercicios_lista13;

import java.util.Arrays;

public class teste {
    public static void main(String[] args) {

        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        System.out.println("Desordenado");
        System.out.println(Arrays.toString(vetor));

        quicksort(vetor, 0, vetor.length - 1);

        System.out.println("\n\nOrdenado");
        System.out.println(Arrays.toString(vetor));
    }
    static void quicksort(int[] vetor, int esquerda, int direita){
        if (esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }
    }
    static int particao(int[] vetor, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;

        while(true){
            do{
                i++;
            } while(vetor[i] < pivot);
            do{
                j--;
            } while(vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            //sempre quando vetor[i] > pivot?
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }
}