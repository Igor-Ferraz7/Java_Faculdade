package Primeiro_Periodo.Exercicios_Treinamento1.tarefa_2d;/*
Descobrir qual dos dois numeros é maior.
Dividir os dois numeros com todos os numeros de 0 até o menor número.
*/

import java.util.Scanner;

public class ex04{
	public static void main(String args[]){
		Scanner ler = new Scanner(System.in);
		int n1, n2, mdc, min_number, max_number;
		
		mdc = 0;
		
		do{
			n1 = ler.nextInt();
			n2 = ler.nextInt();
			
			max_number = Math.max(n1, n2);
			min_number = Math.min(n1, n2);
			
			for (int i = 1; i <= min_number; i++){
				if (max_number % i == 0 && min_number % i == 0){
					mdc = i;
				}
			}
			
			System.out.println(mdc);
		}
		while(n1 != 0 && n2 != 0);
	}
}

/*
cls && javac ex04.java && java ex04
*/