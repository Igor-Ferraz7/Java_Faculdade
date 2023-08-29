//Crie um algoritmo em Java que leia dois números inteiros digitados pelo usuário e exiba o resultado da operação de resto da divisão do primeiro pelo segundo.
import java.util.Scanner;
public class ex02{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		String symbol = "-=";
		String title = "Segundo exercício";
		System.out.printf(symbol.repeat(30) + "- \n");
		System.out.printf("%40s \n", title);
		System.out.printf(symbol.repeat(30) + "- \n");
		System.out.print("Digite um número: ");
		int a = ler.nextInt();
		System.out.print("Digite outro número: ");
		int b = ler.nextInt();
		System.out.printf("O resto da divisão é %d", a%b);
		System.out.printf("\n" + symbol.repeat(30) + "- \n");

	}
}

//javac ex02.java && java ex02