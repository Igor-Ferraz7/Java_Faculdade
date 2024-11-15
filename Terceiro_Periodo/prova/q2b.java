package prova;

import java.util.Arrays;
import java.util.Random;

public class q2b {
	public static void main(String[] args) {
		Random rand = new Random();
		int matriz[][] = new int[7][7];
		int column = matriz[0].length - 1;
		int sum = 0;
	
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
			}
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		for (int i = 0; i < matriz.length; i++) {
			if (matriz[i][column] % 2 != 0) {
				sum += matriz[i][column];
			}
			column--;
		}
		
		System.out.printf("\nSomatório do valores impares da diagonal secundária: %d", sum);
		
	}
}
