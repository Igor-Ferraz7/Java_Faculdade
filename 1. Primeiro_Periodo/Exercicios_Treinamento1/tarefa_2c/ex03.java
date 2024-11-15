/*
Crie um programa que leia um número inteiro e imprima todos os números ímpares
de 0 até o número informado, utilizando a estrutura For.
*/
import java.util.Scanner;

public class ex03{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int numero;
		
		numero = ler.nextInt();
		
		for(int i = 0; i <= numero; i += 2){
			System.out.println(i);
			if (i == 0){
				i++;
				System.out.println(i);
			}
		}
	}
}
/*
cls && javac ex03.java && java ex03
*/