/*
Crie um algoritmo em que leia a idade de uma pessoa e informe a sua classe
eleitoral:
- não eleitor (abaixo de 16 anos);
- eleitor obrigatório (entre a faixa de 18 e menor de 65 anos);
- eleitor facultativo (de 16 até 18 anos e maior de 65 anos, inclusive)
*/

import java.util.Scanner;

public class ex04{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite sua idade: ");
		int idade = ler.nextInt();
		
		if (idade < 16){
			System.out.print("Não eleitor.");
		}
		else if (idade >= 18 && idade < 65){
			System.out.print("Eleitor obrigatório.");
		}
		else{
			System.out.print("Eleitor faculativo.");
		}
	}
}

//cls && javac ex04.java && java ex04