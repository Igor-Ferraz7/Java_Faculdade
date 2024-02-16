package lista_ex4;

/*
4) Criar um método recursivo que irá percorrer toda uma matriz do tipo inteiro
e exibir seus valores na tela. Se possível, tente reutilizar o método do exercício 2.
 */

import java.util.Arrays;
import java.util.Random;

public class ex4 {
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

    public static void percorrerMatriz(int[][] matrix, int line) {
        if (line < matrix.length) {
            System.out.println(Arrays.toString(matrix[line]));
            percorrerMatriz(matrix, line+1);
        }
    }

    public static void percorrerVetor(int[] vector, int position) {
        if (position < vector.length) {
            System.out.printf("Indice %d: %d\n", position, vector[position]);
            percorrerVetor(vector, position+1);
        }
    }

}
