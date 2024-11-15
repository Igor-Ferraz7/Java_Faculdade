package Primeiro_Periodo.Exercicios_Treinamento1.tarefa_2a;/*
Faça um algoritmo que leia dois valores inteiros A e B se os valores forem iguais
deverá se somar os dois, caso contrário multiplique A por B. Ao final de qualquer um
dos cálculos deve-se atribuir o resultado para uma variável C e mostrar seu
conteúdo na tela
*/

import java.util.Scanner;
public class ex04{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o valor de A: ");
		double A =  ler.nextDouble();
		System.out.print("Digite o valor de B: ");
		double B = ler.nextDouble();
		if (A == B){
			double C = A + B;
			System.out.printf("Como A e B são iguais, sua soma é: %.2f", C);
		}
		else{
			double C = A * B;
			System.out.printf("Como A é diferente de B, sua muliplicação é: %.2f", C);
		}
	}
}

//cls && javac ex04.java && java ex04