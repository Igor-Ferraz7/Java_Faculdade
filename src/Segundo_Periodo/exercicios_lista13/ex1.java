package Segundo_Periodo.exercicios_lista13;/*
1. Realize a implementação do algoritmo QUICK SORT utilizando as seguintes formas  de pivôs:

a) Defina o pivô como a primeira posição do vetor.

b) Defina o pivô como aleatório

Após isso, crie um vetor de 10000 posições e realize a comparação de
desempenho com cada um dos pivôs para identificar qual foi o mais rápido.

2. Implemente os três métodos de ordenação(Heap, Shell e Quick) e utilizando a função System.nanoTime(),
 análise quanto tempo cada um dos métodos levou para ordenar um vetor de 1 milhão de posições, do tipo inteiro,
 preenchido com valores aleatórios. Obs.: Para o Quick Sort utilize como pivô um elemento
 aleatório e para o Shell Sort defina o intervalo como k = tamanho vetor / 2
 */

import java.util.Arrays;
import java.util.Random;

public class ex1 {
    public static void main(String[] args) {
        Random rand  = new Random();
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = (int) Math.floor(Math.random() * vetor.length);
        }

        System.out.println("Desordenado:");
        System.out.println(Arrays.toString(vetor));

        System.out.println("\n\nOrdenado com pivo na primeira posição:");
        System.out.println(Arrays.toString(quicksort(vetor, 0, vetor.length - 1, vetor[0])));

        System.out.println("\n\nOrdenado com pivo numa posição aletaória:");
        System.out.println(Arrays.toString(quicksort(vetor, 0, vetor.length - 1, vetor[rand.nextInt(vetor.length)])));

    }
    static int[] quicksort(int[] sorted_vetor, int esquerda, int direita, int pivot){
        if (esquerda < direita){
            int p = particao(sorted_vetor, esquerda, direita, pivot);
            quicksort(sorted_vetor, esquerda, p, pivot);
            quicksort(sorted_vetor, p + 1, direita, pivot);
        }

        return sorted_vetor;
    }
    static int particao(int[] vetor, int esquerda, int direita, int pivot){
        int i = esquerda - 1;
        int j = direita + 1;
        while(true){
            do{
                i++;
            }while(vetor[i] < pivot);
            do{
                j--;
            }while(vetor[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }
    }

}
