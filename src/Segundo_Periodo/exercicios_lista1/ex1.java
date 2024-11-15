package Segundo_Periodo.exercicios_lista1;

import java.util.Scanner;

/*
 * Dado um inteiro N que será informado pelo usuário, realize a tabuada desse número N e
armazene cada resultado em uma posição do vetor e após isso imprimir a tabuada desse
número inteiro
 */

public class ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
		int vetor[] = new int[10];
		
		System.out.print("Insira o valor de N: ");
		N = input.nextInt();
		
		for (int i = 1; i <= 10; i++){
			vetor[i-1] = i*N;
			System.out.printf("%d x %d = %d\n", i, N, vetor[i-1]);
		}
		
		input.close();
	}
}
