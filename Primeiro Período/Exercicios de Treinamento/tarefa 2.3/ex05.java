/*
Escreva um programa que solicite ao usuário um número inteiro e verifique se ele é
primo, utilizando a estrutura For.

para um numero ser primo, ele so pode ser divisivel por ele mesmo e por 1
*/
import java.util.Scanner;

public class ex05{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int numero;
		boolean numero_primo = true;
		
		System.out.print("Digite um número: ");
		numero = ler.nextInt();
		
		for (int i = 2; i < numero; i++){
			if (numero % i == 0){
				numero_primo = false;
			}
		}
		
		if (numero_primo && numero != 1){
			System.out.println("O número é primo.");
		}
		
		else{
			System.out.println("O número não é primo.");
		}
	}
}
/*
cls && javac ex05.java && java ex05
*/