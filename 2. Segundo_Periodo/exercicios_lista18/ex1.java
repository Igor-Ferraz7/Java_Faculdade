package exercicios_lista18;

/*
1 Escreva uma função que recebe o número total de dados inteiros, sendo IDADE e PESO e
 ordena este vetor em ordem crescente de idade e peso, usando o algoritmo de quick sort.

{25,50},{20,30},{30,40},{20,65},{20,40},{18,60},{30,45},{18,65}

você obtém a seguinte ordenação:

{18,60},{18,65},{20,30},{20,40},{20,65},{25,50},{30,40},{30,45}
 */

import java.util.Arrays;
import java.util.Scanner;
/*
Ex: [0][0] = 25
    [0][1] = 50
*/
public class ex1 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] vector_test = {
                {25,50},{20,30},{30,40},{20,65}
        };

//        for (int i = 0; i < vector_test.length; i++) {
//            System.out.println(Arrays.toString(vector_test[i]));
//        }
//        System.out.println("");
//        comparatorSort(vector_test);
//        quicksort(vector_test, 0, vector_test.length - 1);
//
//        for (int i = 0; i < vector_test.length; i++) {
//            System.out.println(Arrays.toString(vector_test[i]));
//        }
        age_weight(4);
    }


    static void age_weight(int many_data) {
        int[][] vector = new int[many_data][2];

        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                if (j % 2 == 0) {
                    System.out.print("Informe o peso: ");
                } else {
                    System.out.print("Informe a idade: ");
                }
                vector[i][j] = input.nextInt();
            }
        }

        comparatorSort(vector);
        quicksort(vector, 0, vector[0].length - 1);

        for (int i = 0; i < vector.length; i++) {
            System.out.println(Arrays.toString(vector[i]));
        }

    }

    static void comparatorSort(int[][] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            for (int j = 0; j < vetor[i].length - 1; j++) {
                if (vetor[i][j] > vetor[i][j + 1]) {
                    System.out.printf("%d > %d\n", vetor[i][j], vetor[i][j+1]);
                    int aux = vetor[i][j];
                    vetor[i][j] = vetor[i][j + 1];
                    vetor[i][j + 1] = aux;
                }
            }
        }
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
        int i = esquerda - 1;
        int j = direita + 1;
        while(true){
            do{
                i++;
            }while(vetor[i][0] < pivot);
            do{
                j--;
            }while(vetor[j][0] > pivot);
            if (i >= j){
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
