package prova;

import java.util.Arrays;
import java.util.Scanner;

public class q1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		char vetor[] = new char[25];
		int count_vogais = 0;
		int count_consoantes = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.printf("Letra %d:", i+1);
			vetor[i] = input.next().charAt(0);
			
			switch (vetor[i]) {
				case 'a':
					count_vogais++;
					break;
				case 'e':
					count_vogais++;
					break;
				case 'i':
					count_vogais++;
					break;
				case 'o':
					count_vogais++;
					break;
				case 'u':
					count_vogais++;
					break;
				default:
					count_consoantes++;
					break;
			}
			
		}
		
		System.out.println(Arrays.toString(vetor));
		System.out.println(count_vogais);
		System.out.println(count_consoantes);
		
		input.close();
		
	}
}
