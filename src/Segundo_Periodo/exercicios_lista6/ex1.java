package Segundo_Periodo.exercicios_lista6;

import java.util.Random;
import java.util.Arrays;

/*
 * 1) Crie em Java, uma matriz 4x4 do tipo inteiro com valores aleatórios e mostre na
 *  tela essa matriz. Após isso, a transforme essa matriz em um vetor, ordene os 
 *  elementos do vetor de forma crescente e exiba na tela este vetor ordenado. 
 *  Ao final, transforme esse vetor ordenado em uma matriz novamente e imprima ela
 *  na tela.

 */

public class ex1 {
	public static void main(String[] args) {
		Random rand = new Random();
		int matriz[][] = new int[4][4];
		int vetor[] = new int[16];
		int count_vetor = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(10);
				vetor[count_vetor] = matriz[i][j];
				count_vetor += 1;
			}
			System.out.println(Arrays.toString(matriz[i]));
		}
		System.out.println("");
		
		Arrays.sort(vetor);
		System.out.println(Arrays.toString(vetor) + "\n");
		count_vetor = 0;
		
		for (int i = 0; i < vetor.length / 4; i++) {
			for (int j = 0; j < vetor.length / 4; j++) {
				matriz[i][j] = vetor[count_vetor];
				count_vetor += 1;
			}
			System.out.println(Arrays.toString(matriz[i]));
		}
		
	}
}
