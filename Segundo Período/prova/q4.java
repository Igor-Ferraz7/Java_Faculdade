package prova;

import java.util.Random;
import java.util.Arrays;

public class q4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int matrizA[][] = new int[4][4];
		int matrizB[][] = new int[4][4];
		
		System.out.println("MatrizA: ");
		
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = rand.nextInt(10);
				matrizB[i][j] = matrizA[i][j] * matrizA[i][j];
			}
			System.out.println(Arrays.toString(matrizA[i]));
		}
		
		System.out.println("\nMatrizB: ");
		
		for (int i = 0; i < matrizB.length; i++) {
			System.out.println(Arrays.toString(matrizB[i]));
		}
		
	}
}