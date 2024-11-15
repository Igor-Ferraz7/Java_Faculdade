package Segundo_Periodo.exercicios_lista3;

import java.util.Random;

/*
 * Crie um vetor de 10 posições que será preenchido de forma aleatória
 *  com valores de 0 a 10. A
partir desse vetor, construa um novo com a seguinte lógica:
novoVetor = [indice0+indice1, indice2+indice3, indice4+indice5, ..., indice n-1+indice n ]
Por exemplo, considere o seguinte vetor:
vetor = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
O resultado do novo vetor, utilizando a lógica proposta:
novoVetor = [1+2, 3+4, 5+6, 7+8, 9+10] => [3, 7, 11, 15, 19];
 */

   public class ex3 {
	public static void main(String[] args) {
		Random rand = new Random();
		int vetor[] = new int[10];
		int vetor2[] = new int[5];
		int counter = 0;
		int j = 1;
		
		//[0 + 1, 2 + 3, 4 + 5,]
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rand.nextInt(11);
			System.out.println(vetor[i]);
		}
		
		System.out.println("");
		
		for (int i = 0; i < vetor.length; i+=2) {
			vetor2[counter] = vetor[i] + vetor[j];
			System.out.println(vetor2[counter]);
			counter++;
			j+=2;
		}
		
	}
}

