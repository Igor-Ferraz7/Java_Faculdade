package exercicios_lista5;

import java.util.Random;

/*
 * Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso
indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor valor da
coluna 7
 */

public class ex3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int matriz[][] = new int[10][10];
		int biggest_in_line = 0;
		int biggest_in_column = 0;
		int smalest_in_line = 10;
		int smalest_in_column = 10;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
				System.out.print("\t" + matriz[i][j]);
				}
			System.out.println("");
			}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == 4 && biggest_in_line < matriz[i][j]) {
					biggest_in_line = matriz[i][j];
					}
				if (i == 4 && smalest_in_line > matriz[i][j]) {
					smalest_in_line = matriz[i][j];
				}
				
				if (j == 6 && biggest_in_column < matriz[i][j]) {
					biggest_in_column = matriz[i][j];
				}
				if (i == 6 && smalest_in_column > matriz[i][j]) {
					smalest_in_column = matriz[i][j];
				}
				
				}
			System.out.println("");
			}
		
		System.out.printf("Maior valor da linha: %d\n", biggest_in_line);
		System.out.printf("Menor valor da linha: %d\n", smalest_in_line);
		
		System.out.printf("Maior valor da coluna: %d\n", biggest_in_column);
		System.out.printf("Menor valor da coluna: %d\n", smalest_in_column);
	}
} 
