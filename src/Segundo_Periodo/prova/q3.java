package Segundo_Periodo.prova;

import java.util.Arrays;

public class q3 {
	public static void main(String[] args) {
		int vetor[] = new int[20];
		int sum_5 = 5;
		
		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 == 0) {
				vetor[i] = sum_5;
				sum_5 += 5;
			} else {
				vetor[i] = 0;
			}
		}
		
		System.out.println(Arrays.toString(vetor));		
		
	}
}
