package exercicios_lista8;

import java.util.Arrays;

public class ex2a {
    public static void main(String[] args){
        int[] vetor = new int[]{3, 4, 9, 2, 5, 8 ,2, 1, 7, 4, 6, 2, 9, 8, 5, 1, 6, 8, 0, 4, 11, 77, 34, 0, -5, 4};
        int aux;
        int inv = 0;

        for (int i = 0; i < vetor.length - 1; i++){
            for (int j = 0; j < vetor.length - 1; j++){
                if (vetor[j] > vetor[j+1]){
                    aux = vetor[j];
                    vetor[j] = vetor[j+1];
                    vetor[j+1] = aux;
                    inv++;
                }
            }
        }


        System.out.println(Arrays.toString(vetor));
        System.out.printf("Foi necessário mudar %d vezes.", inv);
    }
}
