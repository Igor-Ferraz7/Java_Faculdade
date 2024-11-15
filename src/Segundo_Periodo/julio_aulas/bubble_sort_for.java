package Segundo_Periodo.julio_aulas;

import java.util.Arrays;

public class bubble_sort_for {
	public static void main(String[] args) {
		int vetor[] = new int[]{1, 2, 3, 4, 5};
		int aux = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			for (int count = 0; count < vetor.length - 1; count++) {
				if (vetor[count] > vetor[count+1]) {
					aux = vetor[count+1];
					vetor[count+1] = vetor[count];
					vetor[count] = aux;
				}
			}
		}
		
		System.out.println(Arrays.toString(vetor));
		
	}
}