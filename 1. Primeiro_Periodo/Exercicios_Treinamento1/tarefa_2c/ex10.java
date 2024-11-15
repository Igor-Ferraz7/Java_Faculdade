/*
 Crie um programa que solicite ao usuário dois números inteiros e exiba todos os
múltiplos comuns aos dois números no intervalo entre eles, utilizando a estrutura
For.
*/
import java.util.Scanner;

public class ex10{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int  number1, number2, biggest_number, smallest_number;
		
		number1 = input.nextInt();
		number2 = input.nextInt();
		
		if (number1 > number2){
			biggest_number = number1;
			smallest_number = number2;
		}
		
		else{
			biggest_number = number2;
			smallest_number = number1;
		}
		
		for (int i = biggest_number; i >= smallest_number; i--){
			if (i % number1 == 0 && i % number2 == 0){
				System.out.printf("%d, ", i);
			}
		}
		
		System.out.print("\b\b.");
	}
}

/*
cls && javac ex10.java && java ex10
*/