package Terceiro_Periodo.provaN1;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        raizes(1, -3, -54);
        raizes(1, -10, 25);
    }

    public static void raizes(int a, int b, int c) {
        double[] vetor = new double[2];
        int delta = 0;
        delta = b * b - (4 * a * c);

        if (delta == 0) {
            vetor[0] = -b + Math.sqrt(delta);
            vetor[0] /= 2 * a;

        } else if (delta > 0) {
            vetor[0] = -b + Math.sqrt(delta);
            vetor[0] /= 2 * a;

            vetor[1] = -b - Math.sqrt(delta);
            vetor[1] /= 2 * a;

        }

        System.out.println(Arrays.toString(vetor));

    }
}
