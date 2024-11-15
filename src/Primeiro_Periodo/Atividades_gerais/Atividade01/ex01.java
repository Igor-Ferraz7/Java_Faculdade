package Primeiro_Periodo.Atividades_gerais.Atividade01;

import java.util.Scanner;
public class ex01{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		String simbol = "-=";
		String title = "Primeiro exercício";
		System.out.printf(simbol.repeat(30) + "- \n");
		System.out.printf("%40s \n", title);
		System.out.printf(simbol.repeat(30) + "- \n");
		System.out.print("Digite um valor: ");
		float a = ler.nextFloat();
		System.out.print("Digite outro valor: ");
		float b = ler.nextFloat();
		System.out.printf("\nA soma é: %.0f", a+b);
		System.out.printf("\nA subtração é: %.0f", a-b);
		System.out.printf("\nA divisão é: %.2f", a/b);
		System.out.printf("\nA multiplicação é: %.0f \n", a*b);
		System.out.printf(simbol.repeat(30) + "- \n");
	}
}

//javac ex01.java && java ex01