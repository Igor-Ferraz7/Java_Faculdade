package exercicios_lista5;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

/*
 * Solicite que o usuário digite o tamanho de uma matriz quadrada, em seguida gere
numeros aleatórios inteiros para preencher a matriz. Após isso, calcule a SOMA
da primeira linha da matriz A com a soma da primeira linha da matriz B.
 */

public class ex4 {
	public static void main(String[] args) {
		Random rand =  new Random();
		Scanner input = new Scanner(System.in);
		int qtd = 0;
		
		System.out.print("Matriz de ordem: ");
		qtd = input.nextInt();
		int matrizA[][] = new int[qtd][qtd];
		int matrizB[][] = new int[qtd][qtd];
		int sum[] = new int[qtd];
		
		System.out.println("\nMatriz A:");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				matrizA[i][j] = rand.nextInt(10);
				matrizB[i][j] = rand.nextInt(10);
			}
			System.out.println(Arrays.toString(matrizA[i]));
		}
		
		System.out.println("\nMatriz B:");
		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (i == 0) {
					sum[j] = matrizA[i][j] + matrizB[i][j];
				}
			}
			System.out.println(Arrays.toString(matrizB[i]));
		}
		System.out.println("\nSomatorio:");
		System.out.print(Arrays.toString(sum));
		input.close();
	}
}
