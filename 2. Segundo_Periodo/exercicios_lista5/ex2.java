package exercicios_lista5;

import java.util.Random;

/*
 * Crie uma matriz de inteiros de tamanho 4x4, mostre os valores dessa matriz em seguida
informa a diagonal principal dessa matriz.
 */

public class ex2 {
	public static void main(String[] args) {
		Random rand = new Random();
		int matriz[][] = new int[4][4];
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(11);
				System.out.print("\t" + matriz[i][j]);
				}
			System.out.println("");
			}
		
		System.out.print("\nDiagonal Principal: ");
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (i == j) {
					System.out.printf("%d, ", matriz[i][j]);
					}
				}
			}
	}
	
}
