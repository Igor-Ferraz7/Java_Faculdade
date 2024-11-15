package exercicios_lista8;

import java.util.Arrays;

public class ex2b {
    public static void main(String[] args){
        int[] vetor = new int[]{3, 4, 9, 2, 5, 8 ,2, 1, 7, 4, 6, 2, 9, 8, 5, 1, 6, 8, 0, 4, 11, 77, 34, 0, -5, 4};
        int aux, min;
        int inv = 0;

        for (int i = 0; i <  vetor.length; i++){
            min = i;
            for (int j = i + 1; j < vetor.length; j++){
                if (vetor[min] > vetor[j]){
                    min = j;
                }
            }

            aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
            inv++;
        }

        System.out.println(Arrays.toString(vetor));
        System.out.printf("Foi necessário mudar %d vezes.", inv);

    }
}
