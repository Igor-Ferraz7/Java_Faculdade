package Segundo_Periodo.exercicios_lista3;

import java.util.Arrays;

/*
 * Considere os seguintes vetores:
vetA = [ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 6, 3, 0 ]

vetA = [ 0, 4, 2, 1, 5, 6, 2, 8, 1, 2, 1, 5, 6, 3, 0 ]
vetB = [ 1, 5, 7, 3, 1, 1, 5, 2, 8, 4, 6, 1, 4, 5, 3 ]
Com os vetores preenchidos, identifique o padrão e crie um algoritmo que tenha o seguinte
resultado:

vetC = [ -1, 9, 9, -2, 6, 7, -3, 10, 9, -2, 7, 6, 2, 8, 3 ]
 */

public class ex4 {
	public static void main(String[] args) {
		int vetA[] = new int[] {0, 4, 2, 1, 5, 6, 2, 8, 1, 2, 1, 5, 6, 3, 0};
		int vetB[] = new int[] {1, 5, 7, 3, 1, 1, 5, 2, 8, 4, 6, 1, 4, 5, 3};
		int vetC[] = new int[vetA.length];
		
		for (int i = 0; i < vetC.length; i++) {
			if (i % 3 == 0) {
				vetC[i] = vetA[i] - vetB[i];
			} else {
				vetC[i] = vetA[i] + vetB[i];
			}
			
		}
		
		System.out.println(Arrays.toString(vetC));
	}
}
