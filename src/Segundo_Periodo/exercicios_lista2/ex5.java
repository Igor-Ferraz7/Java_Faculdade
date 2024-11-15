package Segundo_Periodo.exercicios_lista2;

import java.util.Scanner;
/*
 * Crie em java um programa com um vetor de 15 posições do tipo String. O usuário deverá
preencher este vetor com nomes aleatórios. Após isso, verifique quantas vezes cada palavra se
repete dentro desse vetor.
Exemplo: [“gato”, “arara”, “ovo”, “gato”, “macarrao”]
gato se repete 2 vez(es)
arara se repete 1 vez(es)
ovo se repete 1 vez(es)
macarrao se repete 1 vez(es)
 */

public class ex5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int length = 4;
		String vetor[] = new String[length];
		int qtd = 1;
		
		for (int i = 0; i < length; i++) {
			vetor[i] = input.next();
		}
		
//		[“gato”, “arara”, “ovo”, “gato”, “macarrao”]
//		[2, 1, 1, 1, 1]
		
		for (int i = 0; i < vetor.length; i++) {
			for (int j = i+1; j < vetor.length; j++) {
				if (vetor[i].equals(vetor[j])) {
					qtd++;
					vetor[j] = null;
				}
			}
			if (vetor[i] != null) {
				System.out.printf("%s repetiu %d vez(es).\n", vetor[i], qtd);
			}
			qtd = 1;	
		}
		
		input.close();
	}
}
