package prova;

import java.util.Random;
import java.util.Arrays;

public class q2a {
	public static void main(String[] args) {
		Random rand = new Random();
		int matriz[][] = new int[7][7];
		int sum = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
			}
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					if (matriz[i][j] % 2 == 0) {
						sum += matriz[i][j];
					}
				}
			}
		}
		
		System.out.printf("\nSomatório dos valores pares da diagonal principal: %d", sum);
		
	}
}