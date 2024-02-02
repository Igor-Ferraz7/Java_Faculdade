package exercicios_lista12;

/*
Dada uma matriz, ordene cada linha da matriz usando o algoritmo Bubble Sort, utilize
FUNÇÃO.
• Crie uma matriz 3x3 com números inteiros aleatórios.
• Use o algoritmo Bubble Sort para ordenar cada linha da matriz em ordem
crescente.
• Exiba a matriz antes e depois da ordenação.
 */

import java.util.Arrays;
import java.util.Random;

public class ex2 {
    static Random rand = new Random();

    public static void main(String[] args) {
        int[][] disorganized_matriz = rand_matriz(3, 3);

        System.out.println("Matriz Embaralhada:");
        for (int line = 0; line < disorganized_matriz.length; line++) {
            System.out.println(Arrays.toString(disorganized_matriz[line]));
        }

        int[][] organized_matriz = sort_matriz(disorganized_matriz);

        System.out.println("\nMatriz Desembaralhada:");
        for (int line = 0; line < organized_matriz.length; line++) {
            System.out.println(Arrays.toString(organized_matriz[line]));
        }

    }

    public static int[][] sort_matriz(int[][] matriz) {
        int aux;

        for (int i = 0; i < matriz.length; i++) {
            for (int count = 0; count < matriz[i].length; count++) {
                for (int j = 0; j < matriz[i].length - 1; j++) {
                    if (matriz[i][j] > matriz[i][j+1]) {
                        aux = matriz[i][j];
                        matriz[i][j] = matriz[i][j+1];
                        matriz[i][j+1] =  aux;
                    }
                }
            }
        }

        return matriz;

    }

    public static int[][] rand_matriz(int lines, int columns) {
        int[][] matriz = new int[lines][columns];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(10, 100);
            }
        }

        return matriz;

    }


}
