package Terceiro_Periodo.lista_ex2;

import java.util.Arrays;

public class ex16 {
    public static void main(String[] args) {
        int[] vetor_a = new int[]{1, 2, 3, 4, 5};
        int[] vetor_b = new int[]{6, 7, 8, 9, 10};

        System.out.println(Arrays.toString(group_vetors(vetor_a, vetor_b)));

    }

    public static int[] group_vetors(int[] vetor_a, int[] vetor_b) {
        int[] vetor_joined = new int[vetor_a.length + vetor_b.length];

        for (int i = 0; i < vetor_joined.length; i++) {
            if (i < vetor_a.length) {
                vetor_joined[i] = vetor_a[i];
            } else {
                vetor_joined[i] = vetor_b[i - vetor_a.length];
            }

        }

        return vetor_joined;

    }

}
