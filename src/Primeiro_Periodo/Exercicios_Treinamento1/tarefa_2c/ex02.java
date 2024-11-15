package Primeiro_Periodo.Exercicios_Treinamento1.tarefa_2c;/*
Crie um programa que solicite ao usuário um número inteiro positivo e calcule a
soma de todos os números pares de 1 até o número inserido, utilizando a estrutura
For.
*/
import java.util.Scanner;

public class ex02{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int numero, soma_par;
		
		soma_par = 0;
		numero = ler.nextInt();
		
		for (int i = 1; i <= numero; i += 2){
			if (i == 1 && numero > 1){
				i++;
			}
			
			if (i % 2 == 0){
				soma_par += i;
			}

		}
		
		System.out.printf("A soma dos números de 1 a %d é %d", numero, soma_par);

	}
}
/*
cls && javac ex02.java && java ex02
*/