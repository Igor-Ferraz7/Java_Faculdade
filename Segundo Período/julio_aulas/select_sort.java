package julio_aulas;

import java.util.Arrays;

public class select_sort {
    public static void main(String[] args) {
        int vetor[] = new int[]{3, 5, 7, 1, 2, 4};
        int aux = 0;
        int min = 0;

        for (int i = 0; i < vetor.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }

            aux = vetor[min];
            vetor[min] = vetor[i];
            vetor[i] = aux;

        }

        System.out.print(Arrays.toString(vetor));

    }
}
