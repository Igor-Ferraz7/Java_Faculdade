package Terceiro_Periodo.lista_ex3;

import java.util.Arrays;
import java.util.Random;

public class ex6 {
    public static void main(String[] args) {
        Random rand  = new Random();
        int[][] matrix = new int[3][3];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }

        imprimirMatriz(matrix);
    }

    public static int[][] imprimirMatriz(int[][] matrix) {
        for (int[] ints : matrix) {
            System.out.println(Arrays.toString(ints));
        }
        return matrix;
    }

}
