/*
Escreva um programa em Java que, utilizando apenas a estrutura de repetição
"for" e condicionais, leia dois números inteiros "x" e "y" do usuário e imprima todos os
números que são divisíveis por "x" e "y" ao mesmo tempo no intervalo entre 1 e 100.
*/

import java.util.Scanner;

public class ex05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int x, y;
		
		x = input.nextInt();
		y = input.nextInt();

		for (int i = 1; i <= 100; i++){
			if (i % x == 0 && i % y == 0){
				System.out.println(i);
			}
		}
	}
}

/*
cls && javac ex05.java && java ex05
*/