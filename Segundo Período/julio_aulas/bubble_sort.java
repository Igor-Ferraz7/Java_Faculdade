package julio_aulas;

import java.util.Arrays;

public class bubble_sort {
	public static void main(String[] args) {
		int vetor[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
		int aux = 0;
		int count = 0;
		
		while (true) {
			count = 0;
			for (int i = 0; i < vetor.length - 1; i++) {
				if (vetor[i] > vetor[i+1]) {
					aux = vetor[i+1];
					vetor[i+1] = vetor[i];
					vetor[i] = aux;
					count += 1;
				}
			}
			
			if (count == 0) {
				System.out.print(Arrays.toString(vetor));
				break;
			}
				
		}
		
	}
}