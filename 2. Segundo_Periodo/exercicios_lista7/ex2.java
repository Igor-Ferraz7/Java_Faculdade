package exercicios_lista7;

import java.util.Arrays;

public class ex2 {
	public static void main(String[] args) {
		int vetor[] = new int[20];
		int count = 1;
		
		for (int i = 0; i < vetor.length; i++) {
			if (i%2 == 0) {
				vetor[i] = count;
				count +=1;
			} else {
				vetor[i] = 0;
			}
		}
		
		System.out.print(Arrays.toString(vetor));
			
	}
}
