/*
Faça um algoritmo que leia um nome e em seguida leia um valor inteiro. Se o valor
inteiro for menor do que 50, então mostre a primeira letra do nome na tela. Se o
valor for maior do que 50 então mostre a última letra do nome
*/

import java.util.Scanner;

public class ex02{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = ler.nextLine();
		
		System.out.print("Digite um valor inteiro: ");
		int valor = ler.nextInt();
		
		if (valor < 50){
			System.out.print(nome.charAt(0));
		}
		else{
			System.out.print(nome.charAt(nome.length() - 1));
		}
	}
}

//cls && javac ex02.java && java ex02