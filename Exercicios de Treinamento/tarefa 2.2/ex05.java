/*
Crie um algoritmo em que receba o valor de x, e calcule e imprima o valor de f(x)

f(x) = 8 
     -----
	 2 - x
*/

import java.util.Scanner;

public class ex05{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o valor de x: ");
		double x = ler.nextDouble();
		
		System.out.printf("O valor de f(x) é: %.2f", (8 / (2 - x)));
	}
}

// cls && javac ex05.java && java ex05
