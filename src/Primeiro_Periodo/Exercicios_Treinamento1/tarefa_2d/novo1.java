package Primeiro_Periodo.Exercicios_Treinamento1.tarefa_2d;/*
Crie um algoritmo que calcule o MDC (Máximo Divisor Comum) de dois
números. O MDC de dois números é o maior número que divide ambos
sem deixar resto. O programa deve continuar pedindo ao usuário para
inserir dois números e imprimir seu MDC até que o usuário insira zero
para ambos os números.
*/

import java.util.Scanner;

public class novo1{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int n1, n2, mdc, min_num, max_num;
		
		do{
			n1 = ler.nextInt();
			n2 = ler.nextInt();
			mdc = 0;
			
			max_num = Math.max(n1, n2);
			min_num = Math.min(n1, n2);
			
			for (int i = 1; i <= min_num; i++){
				if (min_num % i == 0 && max_num % i == 0){
					mdc = i;
				}
			}
			
			System.out.println(mdc);
		}
		while(n1 != 0 && n2 != 0);
	}
}

/*
cls && javac novo1.java && java novo1
*/