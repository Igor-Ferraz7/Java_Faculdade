package Segundo_Periodo.exercicios_lista2;

import java.util.Scanner;

/*
 * Em java, crie um programa que contenha um vetor de 10 posições do tipo String. Cada
posição do vetor será informada pelo usuário. Após o vetor preenchido, mostre na tela a
quantidade de consoantes que cada uma das palavras.
 */

public class ex3 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String vetor[] = new String[10];
		int qtd_vogal = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.next();
//			System.out.println(vetor[i].length());
			
			for (int j = 0; j < vetor[i].length(); j++) {
				switch (vetor[i].toLowerCase().charAt(j)) {
					case 'a':
						qtd_vogal++;
						break;
					case 'e':
						qtd_vogal++;
						break;
					case 'i':
						qtd_vogal++;
						break;
					case 'o':
						qtd_vogal++;
						break;
					case 'u':
						qtd_vogal++;
						break;
					default:
						break;
				}
			}
			System.out.printf("Consoantes %d\n", vetor[i].length() - qtd_vogal);
			
			qtd_vogal = 0;
		}
		input.close();
	}
}