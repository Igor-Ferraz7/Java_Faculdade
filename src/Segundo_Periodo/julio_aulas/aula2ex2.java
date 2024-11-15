package Segundo_Periodo.julio_aulas;

import java.util.Scanner;

public class aula2ex2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String vetor[] = new String[10];
		int qtd_vogal = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			vetor[i] = input.next();
//			System.out.println(vetor[i].length());
			
			for (int j = 0; j < vetor[i].length(); j++) {
				switch (vetor[i].toLowerCase().charAt(j)) {
					case 'a':
						qtd_vogal++;
						break;
					case 'e':
						qtd_vogal++;
						break;
					case 'i':
						qtd_vogal++;
						break;
					case 'o':
						qtd_vogal++;
						break;
					case 'u':
						qtd_vogal++;
						break;
					default:
						break;
				}
			}
			System.out.printf("Vogais %d\n", qtd_vogal);
			System.out.printf("Consoantes %d\n", vetor[i].length() - qtd_vogal);
			
			qtd_vogal = 0;
		}
		input.close();
	}
}
