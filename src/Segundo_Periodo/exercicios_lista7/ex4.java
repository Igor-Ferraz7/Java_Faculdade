package Segundo_Periodo.exercicios_lista7;

import java.util.Arrays;
import java.util.Random;

/*
 * Crie 2 vetores de 10 posições de tipo inteiro. Realiza o seguinte cálculo,
 *  armazenando em um vetorC: 
Primeira posição do vetorA * última índice vetorB; 
Segundo índice do vetorA * penúltima índice do vetor B; 
… 
… 
Última índice do vetorA * primeiro índice do vetorB 

 */

public class ex4 {
	public static void main(String[] args) {
		Random rand = new Random();
		int length = 10;
		int vetorA[] = new int[length];
		int vetorB[] = new int[length];
		int vetorC[] = new int[length];
		int count = 0;
		
		for (int i = 0; i < length; i++) {
			vetorA[i] = rand.nextInt(11);
			vetorB[i] = rand.nextInt(11);
		}
		
		for (int i = length-1; i >= 0; i--) {
			vetorC[count] = vetorA[count] * vetorB[i];
			count++;
		}
		
		System.out.println(Arrays.toString(vetorA));
		System.out.println(Arrays.toString(vetorB));
		System.out.println(Arrays.toString(vetorC));
	}
}
