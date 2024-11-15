package Terceiro_Periodo.lista_ex4;

import java.util.Random;

public class ex4_com_ex3 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[][] matrix = new int[3][4];

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rand.nextInt(10);
            }
        }

        percorrerMatriz(matrix, 0);
    }

    public static void percorrerMatriz(int[][] matrix, int i) {
        if (i < matrix.length) {
            percorrerVetor(matrix[i], 0);
            System.out.println("");
            percorrerMatriz(matrix, i+1);
        }
    }

    public static void percorrerVetor(int[] vector, int position) {
        if (position < vector.length) {
            System.out.printf("%d ", vector[position]);
            percorrerVetor(vector, position+1);
        }
    }

}
