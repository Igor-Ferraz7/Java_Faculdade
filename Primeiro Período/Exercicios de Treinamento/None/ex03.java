/*
Escreva um programa em Java que, utilizando apenas a estrutura de repetição "for"
e condicionais, leia dois números inteiros positivos "a" e "b" do usuário e determine a
quantidade de múltiplos de "a" que estão no intervalo entre 1 e "b" (inclusive)..
Exemplo de Entrada: 15 39
Saída esperada: 2
*/

import java.util.Scanner;

public class ex03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a, b, qtd;
		
		a = input.nextInt();
		b = input.nextInt();
		qtd = 0;
		
		for (int i = 1; i <= b; i++){
			if (a % i == 0){
				qtd++;
			}
		}
		
		System.out.print(qtd);
	}
}

/*
cls && javac ex03.java && java ex03
*/