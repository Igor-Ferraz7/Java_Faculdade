/*
Escreva um algoritmo que leia um valor qualquer. A seguir, mostre uma mensagem
dizendo em qual dos seguintes intervalos: [0,24] (25,49], [50,74], [75,100] o número
está. Caso não esteja no intervalo, você deverá informar que o número está fora do
intervalo.
*/

import java.util.Scanner;
public class ex01{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite um valor: ");
		int n = ler.nextInt();
		if (n >= 0 && n <= 24){
			System.out.print("O valor está no intervalo [0, 24]");
		}
		else if (n >= 25 && n <= 49){
			System.out.print("O valor está no intervalo [25, 49]");
		}
		else if (n >= 50 && n <= 74){
			System.out.print("O valor está no intervalo [50, 74]");
		}
		else if (n >= 75 && n <= 100){
			System.out.print("O valor está no intervalo [75, 100]");
		}
		else{
			System.out.print("O valor está fora do intervalo.");
		}
	}
}

//cls && javac ex01.java && java ex01