package Segundo_Periodo.exercicios_lista12;/*
Considere os seguintes vetores e responda. Utilize FUNÇÃO ou
PROCEDIMENTO para validar toda os métodos em um unico código.
vetor1 = {9, 5, 2, 1, 4, 7, 6, 8, 3};
vetor2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

Qual método de ordenação será mais eficiente para ordenar o vetor1, ou seja, que irá
realizar a menor quantidade de comparações e trocas? E para o vetor2?

 */

public class ex1 {
    static int[] vetor1 = new int[] {9, 5, 2, 1, 4, 7, 6, 8, 3};
    static int[] vetor2 = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};

    public static void main(String[] args) {
        String b_s = best_sort(vetor1);
        String b_s2 = best_sort(vetor2);
        System.out.printf("Para o vetor1 é %s\n", b_s);
        System.out.printf("Para o vetor2 é %s", b_s2);

    }

    public static String best_sort(int[] vetor) {
        int comparation;
        int bubble_sort_swaps = many_swaps("bubble sort", vetor);
        int insertion_sort_swaps = many_swaps("insertion sort", vetor);
        int select_sort_swaps = many_swaps("select sort", vetor);

        comparation = Math.min(bubble_sort_swaps, insertion_sort_swaps);
        comparation = Math.min(comparation, select_sort_swaps);

        if (comparation == bubble_sort_swaps) {
            return "bubble sort";
        } else if (comparation == insertion_sort_swaps) {
            return "insertion sort";
        } else if (comparation == select_sort_swaps) {
            return "select sort";
        } else {
            return "Tanto faz";
        }
    }

    public static int many_swaps(String sort, int[] vetor) {
        int[] vetor_copy = vetor.clone();
        int aux;
        int swaps = 0;

        if (sort.equals("bubble sort")) {
            for (int i = 0; i < vetor_copy.length; i++) {
                for (int j = 0; j < vetor_copy.length - 1; j++) {
                    if (vetor_copy[j] > vetor_copy[j+1]) {
                        aux = vetor_copy[j];
                        vetor_copy[j] = vetor_copy[j+1];
                        vetor_copy[j+1] = aux;
                    }
                    swaps++;
                }
            }

            return swaps;

        } else if (sort.equals("insertion sort")) {
            int j;
            for (int i = 1; i < vetor_copy.length; i++){
                aux = vetor_copy[i];
                for (j = i - 1; j >= 0 && vetor_copy[j] > aux; j--){
                    vetor_copy[j+1] = vetor_copy[j];
                    swaps++;
                }
                vetor_copy[j+1] = aux;
            }

            return swaps;

        } else if (sort.equals("select sort")) {
            int min;
            for (int i = 0; i < vetor_copy.length - 1; i++) {
                min = i;
                for (int j = i + 1; j < vetor_copy.length; j++) {
                    if (vetor_copy[j] < vetor_copy[min]) {
                        min = j;
                        swaps++;
                    }
                }

                aux = vetor_copy[min];
                vetor_copy[min] = vetor_copy[i];
                vetor_copy[i] = aux;

            }
            return swaps;
        }

        return 0;

    }
}
