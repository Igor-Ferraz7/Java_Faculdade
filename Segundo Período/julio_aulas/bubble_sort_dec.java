package julio_aulas;

import java.util.Arrays;

public class bubble_sort_dec {
	public static void main(String[] args) {
		int vetor[] = new int[]{6, 8, 2, 9, 1};
		int aux = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			for (int count = vetor.length; count <= 0; count--) {
				if (vetor[count] > vetor[count-1]) {
					aux = vetor[count-1];
					vetor[count-1] = vetor[count];
					vetor[count] = aux;
				}
			}
		}
		
		System.out.println(Arrays.toString(vetor));
		
	}
}
