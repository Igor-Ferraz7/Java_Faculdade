package exercicios_lista7;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/*
 * Criar e preencher um vetor de 15 posições. Após isso o usuário deverá
 * informar um valor inteiro.
 * O programa deverá verificar se o valor informado se encontra no vetor, e se sim,
 * informar qual sua posição.
 */

public class ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		int vetor[] = new int[15];
		int value = 0;		
		
		value = input.nextInt();
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rand.nextInt(11);
			if (value == vetor[i]) {
				System.out.printf("O valor foi encontrado na posição %d!", i);
				break;
			}
		}
		
		System.out.print("\nVetor: " + Arrays.toString(vetor));
		
		input.close();
	}
}
