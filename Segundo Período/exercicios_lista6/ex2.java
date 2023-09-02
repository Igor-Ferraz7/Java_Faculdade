package exercicios_lista6;

import java.util.Arrays;
import java.util.Random;

/*
 * Em Java crie uma matriz 5x5, em seguida mostre os valores da diagonal secundária c 
 * troque com os valores da diagonal primária
 */

public class ex2 {
	public static void main(String[] agrs) {
		Random rand = new Random();
		int matriz[][] = new int[5][5];
		int diagonal_sec[] = new int[5];
		int diagonal_prim[] = new int[5];
		int count_ds = 4;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
				if (i == j) {
					diagonal_prim[i] = matriz[i][j];
				}
				
				if (j == count_ds) {
					diagonal_sec[i] = matriz[i][j];
					count_ds--;
				}
				
			}
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		System.out.println("\n" + Arrays.toString(diagonal_sec) + "\n");
		count_ds = 4;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					matriz[i][j] = diagonal_sec[i];
				}
				if (j == count_ds) {
					matriz[i][j] = diagonal_prim[i];
					count_ds--;
				}
			}
			System.out.println(Arrays.toString(matriz[i]));
		}
		System.out.println("");
		
	}
}
