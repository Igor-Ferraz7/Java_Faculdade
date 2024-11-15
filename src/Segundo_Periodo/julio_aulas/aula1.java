package Segundo_Periodo.julio_aulas;

import java.util.Scanner;

public class aula1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int vetor[] = new int[5];
		int sum = 0;
		double media = 0;
		
		for(int i = 0; i < vetor.length;  i++) {
			System.out.printf("Vetor[%d]: ", i);
			vetor[i] = scanner.nextInt();
			sum += vetor[i];
		}
		
		media = sum / vetor.length;
		
		System.out.println(sum);
		System.out.print(media);
		scanner.close();
	}
	
}
