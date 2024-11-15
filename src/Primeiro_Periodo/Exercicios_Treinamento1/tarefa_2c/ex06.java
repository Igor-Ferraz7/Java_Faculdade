package Primeiro_Periodo.Exercicios_Treinamento1.tarefa_2c;/*
Desenvolva um programa que calcule e imprima o fatorial de um número informado
pelo usuário, utilizando a estrutura For.
*/
import java.util.Scanner;

public class ex06{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int numero, fatorial;
		
		System.out.print("Insira o valor a ser fatorado: ");
		numero = ler.nextInt();
		fatorial = numero;
		
		for (int i = numero - 1; i > 0; i--){
			fatorial *= i;
		}
		
		System.out.printf("O fatorial de %d é %d.", numero, fatorial);
	}
}

/*
cls && javac ex06.java && java ex06
*/