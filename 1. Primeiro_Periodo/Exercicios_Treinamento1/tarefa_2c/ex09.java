/*
9. Desenvolva um programa que imprima um triângulo de asteriscos com base na
altura informada pelo usuário, utilizando a estrutura For. Por exemplo, se o usuário
informar a altura 4, o programa deve imprimir:

1  2  3  4  5   6  += 1   altura
1  3  5  7  9  11  += 2, 3, 4, 5..  base
*/
import java.util.Scanner;

public class ex09{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String symbol = "";
		int base, height;

		base = 1;
		
		System.out.print("Insira a altura: ");
		height = input.nextInt();
		System.out.println();

		for (int i = height; i >= 1; i--){
			symbol = "*".repeat(base);
			System.out.println(" ".repeat(i) + symbol);
			base += 2;
		}
	}
}
/*
cls && javac ex09.java && java ex09
*/