package exercicios_lista4;

import java.util.Scanner;
import java.util.Random;

public class ex3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int matriz[][] = new int[5][5];
		int column = 0;
		int sum_column = 0;
		
		for (int i= 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(11);
				System.out.print("\t" + matriz[i][j]);
			}
			
			System.out.println("");
		}
		
		System.out.print("Informe a coluna para somar: ");
		column = input.nextInt();
		
		for (int i= 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (j == column - 1) {
					sum_column += matriz[i][j];
				}
			}
		}
		
		System.out.printf("Soma da coluna %d: %d", column, sum_column);
		input.close();
	}
}
