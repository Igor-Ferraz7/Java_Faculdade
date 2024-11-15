package Segundo_Periodo.exercicios_lista1;

import java.util.Arrays;

/*
 * Crie um vetor de 10 caracteres e verifique se é um palíndromo (se a sequência é
 *  a mesma se lida de trás para frente).
 */

public class ex3 {
 public static void main(String[] args) {
	 char characters[] = new char[]{'a', 'n', 'a'};
	 char inverted_vetor[] = new char[characters.length];
	 int j = 0;
	 boolean is_palindrome = false;
	 
	 for (int i = characters.length -1; i >= 0; i--) {
		 inverted_vetor[j] = characters[i];
		 j += 1;
	 }
	 
	 // Verifica se os valores são iguais.
	 is_palindrome = Arrays.equals(characters, inverted_vetor);
	 
	 if (is_palindrome) {
		 System.out.print("O vetor eh um palindromo :)");
	 } else {
		 System.out.print("O vetor não eh um palindromo :(");
	 }
 }
}
