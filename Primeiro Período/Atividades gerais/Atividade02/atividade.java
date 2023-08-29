/*
  Crie um programa que solicite ao usuário um número inteiro positivo e
calcule a soma de todos os números de 1 até o número inserido,
utilizando a estrutura For.
*/
import java.util.Scanner;

public class atividade{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int numero, somatoria;
		somatoria = 0;
		
		numero = ler.nextInt();
		
		for (int i = 1; i <= numero; i++){
			System.out.printf("%d + %d = ", somatoria, i);
			somatoria += i;
			System.out.println(somatoria);
		}
	}
}

/*
cls && javac atividade.java && java atividade
*/