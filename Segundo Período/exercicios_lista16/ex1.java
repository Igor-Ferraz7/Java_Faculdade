package exercicios_lista16;

import java.util.Arrays;
import java.util.Random;

/*
 Crie um vetor com 500 posições, faça a ordenação usando os algoritmos avançados visto em sala.
 Em seguida, faça uma BUSCA BINÁRIA para encontrar um numero aleatório, e através do método NANOTIME,
 verifique qual algoritmo de ordenação foi o mais eficiente.
 */

public class ex1 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(10);
        }

        int quick_time = execut_time(vetor, "quick");
        int heap_time = execut_time(vetor, "heap");
        int shell_time = execut_time(vetor, "shell");

        System.out.printf("quick_time: %d\nheap_time: %d\nshell_time: %d\n", quick_time, heap_time, shell_time);

        int num = Math.min(quick_time, heap_time);
        int min_time = Math.min(num, shell_time);

        if (min_time == quick_time) {
            System.out.println("O mais eficiente foi o quick sort.");
        } else if (min_time == heap_time) {
            System.out.println("O mais eficiente foi o heap sort.");
        } else {
            System.out.println("O mais eficiente foi o shell sort.");
        }

    }


    static int execut_time(int[] vetor, String order_method) {
        Random rand = new Random();
        long start_time = System.nanoTime();
        int[] sorted_vetor;

        if (order_method.equals("quick")) {
            sorted_vetor = quicksort(vetor, 0, vetor.length - 1);
        } else if (order_method.equals("heap")) {
            sorted_vetor = heap_sort(vetor);
        } else {
            sorted_vetor = shell(vetor);
        }

        int random_num = rand.nextInt(10);
        binary_find(random_num, sorted_vetor);
        long end_time = System.nanoTime();

        return (int) (end_time - start_time);
    }


    static void binary_find(int num, int[] vetor) {
        int start = 0;
        int end = vetor.length - 1;
        boolean is_find = false;

        long start_time = System.nanoTime();

        while (start <= end) {
            int middle = (start + end) / 2;

            if (vetor[middle] == num) {
                is_find = true;
                break;
            }
            if (vetor[middle] < num) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

    }


    static int[] shell(int[] vetor) {
        int[] inner_vetor = Arrays.copyOf(vetor, vetor.length);
        int h = inner_vetor.length / 2;
        int n = inner_vetor.length;
        while (h < n) {
            h = h * 3 + 1;
        }
        h = (int) Math.floor(h / 3);

        int elemento, j;
        while (h > 0) {
            for (int i = h; i < n; i++) {
                elemento = inner_vetor[i];
                j = i;
                while (j >= h && inner_vetor[j - h] > elemento) {
                    inner_vetor[j] = inner_vetor[j - h];
                    j = j - h;
                }
                inner_vetor[j] = elemento;
            }
            h = h / 2;
        }

        return inner_vetor;
    }


    static void aplicarHeap(int[] vetor, int n, int i) {
        int[] inner_vetor = Arrays.copyOf(vetor, vetor.length);
        int raiz = i;
        int esquerda = 2 * i + 1;
        int direita = 2 * i + 2;

        if (esquerda < n && inner_vetor[esquerda] > inner_vetor[raiz]) {
            raiz = esquerda;
        }
        if (direita < n && inner_vetor[direita] > inner_vetor[raiz]) {
            raiz = direita;
        }

        if (raiz != i) {
            int aux = inner_vetor[i];
            inner_vetor[i] = inner_vetor[raiz];
            inner_vetor[raiz] = aux;

            aplicarHeap(inner_vetor, n, raiz);
        }
    }


    static int[] heap_sort(int[] vetor) {
        int[] inner_vetor = Arrays.copyOf(vetor, vetor.length);
        int n = inner_vetor.length;

        for(int i = n / 2 - 1; i >= 0; i--){
            aplicarHeap(inner_vetor, n, i);
        }

        for(int j = n-1; j > 0; j--){
            int aux = inner_vetor[0];
            inner_vetor[0] = inner_vetor[j];
            inner_vetor[j] = aux;

            aplicarHeap(inner_vetor, j, 0);
        }

        return inner_vetor;

    }


    static int[] quicksort(int[] vetor, int esquerda, int direita){
        int[] inner_vetor = Arrays.copyOf(vetor, vetor.length);
        if (esquerda < direita){
            int p = particao(vetor, esquerda, direita);
            quicksort(vetor, esquerda, p);
            quicksort(vetor, p + 1, direita);
        }

        return inner_vetor;
    }

    
    static int particao(int[] vetor, int esquerda, int direita) {
        int[] inner_vetor = Arrays.copyOf(vetor, vetor.length);
        int meio = (int) (esquerda + direita) / 2;
        int pivot = inner_vetor[meio];
        int i = esquerda - 1;
        int j = direita + 1;
        while (true) {
            do {
                i++;
            } while (inner_vetor[i] < pivot);
            do {
                j--;
            } while (inner_vetor[j] > pivot);
            if (i >= j) {
                return j;
            }
            int aux = inner_vetor[i];
            inner_vetor[i] = inner_vetor[j];
            inner_vetor[j] = aux;
        }
    }
}
