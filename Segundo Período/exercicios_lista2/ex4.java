package exercicios_lista2;
import java.util.Scanner;
/*
 * Crie em java um programa que contenha um vetor de 10 posições do tipo String.
 * O vetor será preenchido pelo usuário. 
 * Após o vetor preenchido, substitua todas as vogais ''a'' pelo valor 0,
''e'' pelo valor 1, ''i'' pelo valor 2, ''o'' pelo valor 3, ''u'' pelo valor 4.
 */

public class ex4 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String vetor[] = new String[15];
		int word_length = 0;
		String concatenated_string = "";
		
		System.out.printf("Digite %d palavars: ", vetor.length);
		
		// Adicionando palavras ao vetor
		for(int i = 0; i < vetor.length; i++) {
			vetor[i] = input.next();
		}
		
		// Iterando sobre o vetor
		for(int i = 0; i < vetor.length; i++) {
			word_length = vetor[i].length();
			char word_vetor[] = new char[word_length]; // Vetor que guardará cada letra da palavra
			
			// Iterando letra por letra da palavra
			for (int j = 0; j < word_length; j++) {
				word_vetor[j] = vetor[i].toLowerCase().charAt(j);
				
				switch(vetor[i].toLowerCase().charAt(j)) {
					case 'a':
						word_vetor[j] = '0';
						break;
					case 'e':
						word_vetor[j] = '1';
						break;
					case 'i':
						word_vetor[j] = '2';
						break;
					case 'o':
						word_vetor[j] = '3';
						break;
					case 'u':
						word_vetor[j] = '4';
						break;
					default:
						break;
				}
				// Formando a palavra que estava separada letra por letra
				concatenated_string += word_vetor[j];
			}
			
			vetor[i] = concatenated_string;
			concatenated_string = "";
			
			System.out.println(vetor[i]);
		}
		
		input.close();
	}
}
