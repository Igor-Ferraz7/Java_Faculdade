package Segundo_Periodo.exercicios_lista4;

import java.util.Random;

public class ex2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int lines = 5;
		int columns = 3;
		int matriz[][] = new int[lines][columns];
		int lines_sum[] = new int[lines];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(11);
				System.out.print("\t" + matriz[i][j]);
				lines_sum[i] += matriz[i][j]; 
				
			}
			System.out.printf(" Soma = %d\n", lines_sum[i]);
			
		}	
	}
}
