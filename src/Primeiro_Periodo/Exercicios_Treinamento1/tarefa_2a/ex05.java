package Primeiro_Periodo.Exercicios_Treinamento1.tarefa_2a;/*
Em um determinado Estado, para transferências de veículos, o DETRAN cobra uma
taxa de 1.8% para carros fabricados antes de 1990 e uma taxa de 2.5% para os
fabricados de 1990 em diante, a taxa está incidindo sobre o valor de tabela do carro.
O algoritmo abaixo lê o ano e o preço do carro e a seguir calcula e imprime imposto
a ser pago.
*/
import java.util.Scanner;
public class ex05{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o ano de seu carro: ");
		int ano = ler.nextInt();
		System.out.print("Digite o preço do seu carro: ");
		int valor = ler.nextInt();
		if (ano < 1990){
			System.out.printf("O imposto a ser pago é de R$%.2f", (valor + valor * 0.018));
		}
		else{
			System.out.printf("O imposto a ser pago é de R$%.2f", (valor + valor * 0.025));
		}
	}
}

//cls && javac ex05.java && java ex05