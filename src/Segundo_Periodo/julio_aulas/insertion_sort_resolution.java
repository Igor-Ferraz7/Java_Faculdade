package Segundo_Periodo.julio_aulas;

import java.util.Arrays;

public class insertion_sort_resolution {
    public static void main(String[] agrs){
        int[] vetor = new int[]{33, 1, 0, 21, 5, 9};
        int aux, j;

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
