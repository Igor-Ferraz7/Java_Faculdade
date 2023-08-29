/*
Com base na tabela abaixo, escreva um algoritmo que leia o código de um item e a
quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
1 - 7,00
2 - 7,5
3 - 8,5
4 - 9,00
5 - 3,5
*/
import java.util.Scanner;
public class ex02{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite o código do item: ");
		int codigo = ler.nextInt();
		System.out.print("Digite a quantidade deste item: ");
		int quantidade = ler.nextInt();
		if (codigo == 1){
			double valor = 7 * quantidade;
			System.out.printf("A conta a pagar é R$%.2f", valor);
		}
		else if (codigo == 2){
			double valor = 7.5 *  (double) quantidade;
			System.out.printf("A conta a pagar é R$%.2f", valor);
		}
		else if (codigo == 3){
			double valor = 8.5 * quantidade;
			System.out.printf("A conta a pagar é R$%.2f", valor);
		}
		else if (codigo == 4){
			double valor = 9 * quantidade;
			System.out.printf("A conta a pagar é R$%.2f", valor);
		}
		else if (codigo == 5){
			double valor = 3.5 * quantidade;
			System.out.printf("A conta a pagar é R$%.2f", valor);
		}
	}
}

//cls && javac ex02.java && java ex02