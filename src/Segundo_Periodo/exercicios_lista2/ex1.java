package Segundo_Periodo.exercicios_lista2;

import java.util.Scanner;

/*
 * Crie um programa java que contenha um vetor de 5 posições do tipo String que armazenam
nomes de objetos informados pelo usuário (Utilize o método next()). Após o vetor ser todo
preenchido, mostre na tela a quantidade de letras de cada uma das palavras informadas.
 */
public class ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String vetor[] = new String[5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.next();
			System.out.printf("%s: %d letra(s)\n", vetor[i], vetor[i].length());
		}
		input.close();
	}
}
