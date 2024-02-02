package exercicios_lista12;

/*
Faça uma função que receba uma matriz A(10,10), por parâmetro, e realize as
seguintes trocas:
• a linha 2 com a linha 8;
• a coluna 4 com a coluna 10;
• a diagonal principal com a secundária;
• a linha 5 com a coluna 10;
• a função deve retornar a matriz alterada
 */

import java.util.Arrays;

public class ex4 {

    public static void main(String[] args) {
        int[][] randed_matriz = ex2.rand_matriz(10, 10);

        System.out.println("\nMatriz Original:");
        for (int line = 0; line < randed_matriz.length; line++) {
            System.out.println(Arrays.toString(randed_matriz[line]));
        }

        int[][] altered_matriz = changed_matriz(randed_matriz);
        System.out.println("\nMatriz Alterada:");
        for (int line = 0; line < altered_matriz.length; line++) {
            System.out.println(Arrays.toString(altered_matriz[line]));
        }

    }

    public static int[][] changed_matriz(int[][] matriz) {
        int[] aux_line = new int[10];
        int[] aux_column = new int[10];
        int[] aux_diagonal = new int[10];
        int[] aux_diagonal_sec = new int[10];
        int aux_count = 0;

        // • a linha 2 com a linha 8
        for (int j = 0; j < matriz[1].length; j++) {
            aux_line[j] = matriz[1][j];
            matriz[1][j] = matriz[7][j];
        }

        // • a coluna 4 com a coluna 10
        for (int i = 0; i < matriz.length; i++) {
            aux_column[i] = matriz[i][3];
            matriz[i][3] = matriz[i][9];
            matriz[i][9] = aux_column[i];
        }

        // • a diagonal principal com a secundária
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                aux_diagonal[j] = matriz[j][j];
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = matriz[i].length - 1; j >= 0; j--) {
                aux_diagonal_sec[aux_count] = matriz[i][j];
                matriz[i][j] = aux_diagonal[aux_count];
                aux_count++;
                i++;
            }
            break;
        }

        for (int i = 0; i < matriz.length; i++) {
            matriz[i][i] = aux_diagonal_sec[i];
        }

        // • a linha 5 com a coluna 10
        for (int j = 0; j < matriz[1].length; j++) {
            aux_line[j] = matriz[4][j];
            matriz[4][j] = matriz[j][9];
            matriz[j][9] = aux_line[j];
        }

        return matriz;

    }

}