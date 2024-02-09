/*
8. Escreva um programa que solicite ao usuário a quantidade de números que ele
deseja informar. Em seguida, o programa deve solicitar os números e calcular a
média, utilizando a estrutura For.
*/
import java.util.Scanner;

public class ex08{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int numeros;
		numeros = 0;
		double media, quantidade;
		
		System.out.print("Quantidade: ");
		quantidade = input.nextDouble();
		
		for (int i = 1; i <= quantidade; i++){
			numeros += input.nextInt();
		}
		
		media = numeros / quantidade;
		
		System.out.printf("%.2f", media);
	}
}

/*
cls && javac ex08.java && java ex08
*/
