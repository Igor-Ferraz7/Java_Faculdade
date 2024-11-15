package Segundo_Periodo.exercicios_lista3;

public class ex1 {
	public static void main(String[] args) {
		int vetor[] = new int[20];
		int j = 1;
		
		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 == 0) {
				vetor[i] = j*j;
				j++;
			} else {
				vetor[i] = 0;
			}
			
			System.out.print(vetor[i]);

		}
	}
}
