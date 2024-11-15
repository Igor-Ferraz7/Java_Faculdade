package Segundo_Periodo.exercicios_lista1;

import java.util.Random;
/*
 * Ler três vetores (A, B e C) com 5 elementos cada. Construir um vetor D, sendo esta a
 *  junção dos três outros vetores. Desta forma D deverá ter o triplo de elementos,
 *  ou seja, 15. Apresentar os elementos do vetor D.
 */

//Arrays.toString(vetor);

public class ex5 {
	public static void main(String[] args) {
		Random rand = new Random();
		
		int len = 5;
		int vetorA[] = new int[len];
		int vetorB[] = new int[len];
		int vetorC[] = new int[len];
		int vetorD[] = new int[vetorA.length + vetorB.length + vetorC.length];
		int i = 0;
		
		for(i = 0; i < vetorA.length; i++) {
			vetorA[i] = rand.nextInt(100);
			vetorB[i] = rand.nextInt(100);
			vetorC[i] = rand.nextInt(100);
			
			vetorD[i] = vetorA[i];
			vetorD[vetorB.length + i] = vetorB[i];
			vetorD[vetorA.length + vetorB.length + i] = vetorC[i];
		}
		
		for (i = 0; i < vetorD.length; i++) {
			System.out.printf("%d, ", vetorD[i]);		
		}
	}
}
