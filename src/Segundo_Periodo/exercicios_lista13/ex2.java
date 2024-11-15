package Segundo_Periodo.exercicios_lista13;/*
2. Implemente os três métodos de ordenação(Heap, Shell e Quick) e utilizando a função System.nanoTime(),
 análise quanto tempo cada um dos métodos levou para ordenar um vetor de 1 milhão de posições, do tipo inteiro,
 preenchido com valores aleatórios. Obs.: Para o Quick Sort utilize como pivô
 um elemento aleatório e para o Shell Sort defina o intervalo como k = tamanho vetor / 2
 */

import java.util.Random;

public class ex2 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetor = new int[1000000];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(100);
        }

        System.out.printf("Tempo com Shell: %d\n", shell_time(vetor));
        System.out.printf("Tempo com o Heap: %d\n", heap_time(vetor));
        System.out.printf("Tempo com o Quick: %d\n", quick_time(vetor));

    }

    static int shell_time(int[] sorted_vetor) {
        long start_time = System.nanoTime();
        int h = sorted_vetor.length / 2;
        int n = sorted_vetor.length;
        while (h < n) {
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);

        int elemento, j;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                elemento = sorted_vetor[i];
                j = i;
                while (j >= h && sorted_vetor[j - h] > elemento) {
                    sorted_vetor[j] = sorted_vetor[j - h];
                    j = j - h;
                }
                sorted_vetor[j] = elemento;
            }
            h = h / 2;
        }
        long end_time = System.nanoTime();

        return (int) (end_time - start_time);

    }

    static void aplicarHeap(int[] vetor_interno, int n, int i) {
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && vetor_interno[esquerda] > vetor_interno[raiz]) {
            raiz = esquerda;
        }
        if (direita < n && vetor_interno[direita] > vetor_interno[raiz]) {
            raiz = direita;
        }

        if (raiz != i) {
            int aux = vetor_interno[i];
            vetor_interno[i] = vetor_interno[raiz];
            vetor_interno[raiz] = aux;

            aplicarHeap(vetor_interno, n, raiz);
        }
    }

    static int heap_time(int[] vetor_interno) {
        long start_time = System.nanoTime();
        int n = vetor_interno.length;

        for(int i = n / 2 - 1; i >= 0; i--){
            aplicarHeap(vetor_interno, n, i);
        }

        for(int j = n-1; j > 0; j--){
            int aux = vetor_interno[0];
            vetor_interno[0] = vetor_interno[j];
            vetor_interno[j] = aux;

            aplicarHeap(vetor_interno, j, 0);
        }
        long end_time = System.nanoTime();

        return (int) (end_time - start_time);
    }

    static void quicksort(int[] vetor, int esquerda, int direita){
        if (esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }
    }
    static int particao(int[] vetor_interno, int esquerda, int direita){
        int meio = (int) (esquerda + direita) / 2;
        int pivot = vetor_interno[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while(true){
            do{
                i++;
            }while(vetor_interno[i] < pivot);
            do{
                j--;
            }while(vetor_interno[j] > pivot);
            if (i >= j){
                return j;
            }
            int aux = vetor_interno[i];
            vetor_interno[i] = vetor_interno[j];
            vetor_interno[j] = aux;
        }
    }

    static int quick_time(int[] vetor_interno) {
        long start_time = System.nanoTime();
        quicksort(vetor_interno, 0, vetor_interno.length - 1);
        long end_time = System.nanoTime();

        return (int) (end_time - start_time);

    }

}
