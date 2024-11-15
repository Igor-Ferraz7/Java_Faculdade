package Terceiro_Periodo.prova;// linha aumentar / coluna diminuir

import java.util.Arrays;
import java.util.Random;

public class q2c {
	public static void main(String[] args) {
		Random rand = new Random();
		int matriz[][] = new int[7][7];
		double sum = 0;
		double media = 0;
	
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
				if (i == 3) {
					sum += matriz[i][j];
				}
			}
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		media = sum / 7;
		System.out.printf("\nMédia da linha 4: %.2f", media);
	}
}
