package Segundo_Periodo.exercicios_lista9;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args){
        one_to_ten();
        pairs_in_100();
        tabuada_5();
    }

    static void one_to_ten(){
        int[] vetor = new int[11];
        for (int i = 1; i <= 10; i++){
            vetor[i] = i;
        }
        System.out.println(Arrays.toString(vetor));
    }

    static void pairs_in_100(){
        int[] vetor = new int[50];
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){
                vetor[i/2] = i;
            }
        }

        System.out.println(Arrays.toString(vetor));
    }

    static void tabuada_5(){
        int[] vetor = new int[11];
        for (int i = 1; i <= 10; i++){
            vetor[i] = 5 * i;
        }

        System.out.println(Arrays.toString(vetor));
    }

}
