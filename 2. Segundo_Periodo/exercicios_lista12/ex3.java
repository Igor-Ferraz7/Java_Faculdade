package exercicios_lista12;

/*
Na teoria dos sistemas, define-se como elemento minimax de uma matriz o
menor elemento de uma linha onde se encontra o maior elemento da matriz.
Faça uma função que recebe, por parâmetro, uma matriz A(10,10) e retorna o
seu elemento minimax, juntamente com a sua posição.
 */

import java.util.Arrays;

public class ex3 {
    public static void main(String[] args) {
        int[][] randed_matriz = ex2.rand_matriz(10, 10);

        System.out.println("Matriz 10x10:");
        for (int line = 0; line < randed_matriz.length; line++) {
            System.out.println(Arrays.toString(randed_matriz[line]));
        }

        int[] answers = minimax(randed_matriz);

        System.out.printf("Minmax: %d\n", answers[0]);
        System.out.printf("Posição: [%d][%d]", answers[1], answers[2]);

    }

    public static int[] minimax(int[][] matriz) {
        int line, column;
        line = column = 0;
        int biggest_num = -1;
        int smallest_num = matriz[0][0];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                biggest_num = Math.max(biggest_num, matriz[i][j]);
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == biggest_num) {
                    for (int j2 = 0; j2 < matriz[i].length - 1; j2++) {
                        if (smallest_num > matriz[i][j2]) {
                            smallest_num = matriz[i][j2];
                            line = i;
                            column = j2;
                        }
                    }
                }
            }
        }

        int[] answers = new int[]{smallest_num, line, column};

        return answers;

    }

}
