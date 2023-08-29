/*
Faça um algoritmo que leia os valores A, B, C e imprima na tela se a soma de A + B
é menor que C.
*/

import java.util.Scanner;
public class ex03{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Diga o valor de A: ");
		double A = ler.nextDouble();
		System.out.print("Diga o valor d B: ");
		double B = ler.nextDouble();
		System.out.print("Diga o valor de C: ");
		double C = ler.nextDouble();
		double soma = A + B;
		if (soma < C){
			System.out.print("A soma de A + B não é maior que C.");
		}
		else if (soma ==  C){
			System.out.print("A soma de A + B é igual a C.");
		}
		else{
			System.out.print("A soma de A + B é maior que C.");
		}
	}
}

//cls && javac ex03.java && java ex03