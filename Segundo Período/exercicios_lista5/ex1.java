package exercicios_lista5;

import java.util.Random;

/*
 * Crie uma matriz de inteiros de tamanho 3x5, mostre os valores dessa matriz e em seguida a
sua matriz transposta.
 */

public class ex1 {
	public static void main(String[] args) {
	Random rand = new Random();
	int matriz[][] = new int[3][5];
//	int matriz_transposta[][] = new int[5][3];
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[i].length; j++) {
			matriz[i][j] = rand.nextInt(11);
			System.out.print("\t" + matriz[i][j]);
			}
		System.out.println("");
		}
	
	System.out.println("");
	
	int linhas = matriz.length;
	int colunas = matriz[0].length;
	int matriz_transposta[][] = new int[colunas][linhas];
	
	for (int i = 0; i < matriz.length; i++) {
		for (int j = 0; j < matriz[0].length; j++) {
			matriz_transposta[j][i] = matriz[i][j];
//			System.out.print("\t" + matriz_transposta[i][j]);
			}
//		System.out.println("");
		}
	
	for (int i = 0; i < matriz_transposta.length; i++) {
		for (int j = 0; j < matriz_transposta[0].length; j++) {
			System.out.print("\t" + matriz_transposta[i][j]);
			}
		System.out.println("");
		}
	
	}
}