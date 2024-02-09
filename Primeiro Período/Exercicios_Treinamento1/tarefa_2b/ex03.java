/*
Faça um algoritmo que leia um nome e uma idade. Se a idade for par, mostre uma
mensagem na tela informando que a idade é par e em seguida defina a cor do gato
para 10. Se a idade for ímpar, mostre na tela uma mensagem dizendo que a idade é
ímpar e em seguida mostre na tela a quantidade de caracteres que possui o nome
informado.
*/

import java.util.Scanner;

public class ex03{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = ler.nextLine();
		
		System.out.print("Digite sua idade : ");
		int idade = ler.nextInt();
		
		if (idade % 2 == 0){
			System.out.print("A idade é par. \033[33m (ÔwÔ) \033[m");
		}
		else{
			System.out.print("A idade é ímpar.\nE a quantidade de caracteres do seu nome é: " + nome.length());
		}
	}
}

//cls && javac ex03.java && java ex03