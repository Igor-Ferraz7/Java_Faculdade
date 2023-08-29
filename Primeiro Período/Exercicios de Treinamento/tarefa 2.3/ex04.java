/*
Desenvolva um programa que imprima a tabuada de um número informado pelo
usuário, utilizando a estrutura For.
*/
import java.util.Scanner;

public class ex04{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int numero;
		
		System.out.print("Digite um valor: ");
		numero = ler.nextInt();
		
		for (int i = 0; i <= 10; i++){
			System.out.printf("%d * %d = %d\n", numero, i, numero * i);
		}
	}
}
/*
cls && javac ex04.java && java ex04
*/