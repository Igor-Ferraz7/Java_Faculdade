package julio_aulas;

import java.util.Arrays;

public class insertion_sort {
    public static void main(String[] args) {
        int[] vetor = new int[]{33, 1, 0, 21, 5, 9};
        boolean is_allocated;
        int min, aux;

        for (int i = 0; i < vetor.length - 1; i++) {
            is_allocated = false;
            aux = i;
            if (vetor[aux] > vetor[i+1]){
                aux = i+1;
                min = vetor[aux];
                for (int j = i; j >= 0; j--){
                    if (min < vetor[j]){
                        vetor[j+1] = vetor[j];
                    }  else {
                        vetor[j+1] = min;
                        is_allocated = true;
                        break;
                    }
                }

                if (!is_allocated){
                    vetor[0] = min;
                }

            }
        }

        System.out.print(Arrays.toString(vetor));

    }
}