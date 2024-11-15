package Segundo_Periodo.exercicios_lista4;

import java.util.Random;

public class ex4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int matriz[][] = new int[3][3];
		int num_central = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
				System.out.print("\t" + matriz[i][j]);
				if (i == 1 && j == 1) {
					num_central = matriz[i][j];
				}
			}
			
			System.out.println("");
		}
		
		System.out.print(num_central);
	}
}
