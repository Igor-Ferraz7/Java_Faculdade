package Segundo_Periodo.exercicios_lista2;

import java.util.Scanner;
/*
 * Crie em java um programa que contenha um vetor de 10 posições do tipo String.
 * O vetor será preenchido pelo usuário. 
 * Após o vetor preenchido, substitua todas as vogais ''a'' pelo valor 0,
''e'' pelo valor 1, ''i'' pelo valor 2, ''o'' pelo valor 3, ''u'' pelo valor 4.
 */

public class ex4resp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String vetor[] = new String[4];
		
		System.out.printf("Digite %d palavars: ", vetor.length);
		
		// Adicionando palavras ao vetor
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = input.next();
		}
		
		// Iterando sobre o vetor
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = vetor[i].toLowerCase().replaceAll("a", "0");
			vetor[i] = vetor[i].toLowerCase().replaceAll("i", "2");
			vetor[i] = vetor[i].toLowerCase().replaceAll("o", "3");
			vetor[i] = vetor[i].toLowerCase().replaceAll("e", "1");
			vetor[i] = vetor[i].toLowerCase().replaceAll("u", "4");
//			for (int j = 0; j < vetor[i].length(); j++) {
//				switch(vetor[i].toLowerCase().charAt(j)) {
//				case 'a':
//					vetor[i] = vetor[i].replace("a", "0");
//
//				case 'e':
//					vetor[i] = vetor[i].replace("e", "1");
//
//				case 'i':
//					vetor[i] = vetor[i].replace("i", "2");
//
//				case 'o':
//					vetor[i] = vetor[i].replace("o", "3");
//
//				case 'u':
//					vetor[i] = vetor[i].replace("u", "4");
//				}
//			}
			System.out.println(vetor[i]);
		}
		
		input.close();
	}
}