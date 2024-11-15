package Primeiro_Periodo.Exercicios_Treinamento1.tarefa_2c;/*
7. Crie um programa que imprima os primeiros 10 números da sequência de Fibonacci,
usando a estrutura For.
*/
import java.util.Scanner;

public class ex07{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int num_anterior, num_resultante;
		num_anterior = num_resultante = 0;
		
		 for (int i = 1; i <= 10; i++){
			 System.out.printf("%d, ", num_resultante);
			 if (i == 1){
				 num_anterior += 1;
				 num_resultante = num_anterior; // primeiro numero -> 0 + 1 = 1
			 }
			 			 
			 else{
				 num_resultante += num_anterior; // terceiro numero -> 1 + 2 = 3
				 num_anterior = num_resultante - num_anterior;
			 }
			 
		 }
		 
		 System.out.print("\b\b.");
	}
}
/*
cls && javac ex07.java && java ex07
*/