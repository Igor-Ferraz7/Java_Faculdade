package Segundo_Periodo.exercicios_lista3;

import java.util.Random;

public class ex2 {
	public static void main(String[] args) {
		int vetor[] = new int[16];
		Random rand = new Random();
		double sum = 0;
		double media = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = rand.nextInt(101);
			sum += vetor[i];
			System.out.println(vetor[i]);
		}
		
		media = sum/vetor.length;
		
		System.out.printf("%.2f", media);
	}
}
