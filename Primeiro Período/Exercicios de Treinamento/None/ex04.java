/*
Escreva um programa em Java que, utilizando apenas a estrutura de repetição
"for" e condicionais, leia um número inteiro positivo "n" do usuário e calcule a soma dos
dígitos deste número.
*/

import java.util.Scanner;

public class ex04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n, soma;
		
		n = input.nextInt();
		soma = 0;
		
		for (int i = n; i > 0; i /= 10){
			soma += i % 10;
		}
		
		System.out.print(soma);
	}
}

/*
cls && javac ex04.java && java ex04
*/