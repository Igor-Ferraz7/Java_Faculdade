package Segundo_Periodo.julio_aulas;

import java.util.Scanner;

public class aula2ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String vetor[] = new String[5];
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.next();
			
		}
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("%s possui %d letras.\n", vetor[i], vetor[i].length());
		}
		input.close();
	}
}
