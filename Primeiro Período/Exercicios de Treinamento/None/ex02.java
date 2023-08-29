/*
Escreva um algoritmo em Java que receba dois números inteiros positivos a e b,
sendo a menor ou igual a b, e calcule a soma dos números ímpares no intervalo
entre a e b (inclusive) usando apenas estruturas de repetição for e condicionais.
Imprima a soma na saída.
Exemplo de Entrada: 5 17
Saída esperada: 77
*/
import java.util.Scanner;

public class ex02{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a, b, soma;
		
		a = input.nextInt();
		b = input.nextInt();
		soma = 0;
		
		if (a > b){
			for (int i = 1; i >= 1; i++){
				System.out.println("A variável 'a' precisa ser menor ou igual a 'b'.");
				System.out.print("Insira o valor de 'a' novamente: ");
				a = input.nextInt();
				
				if (a <= b){
					break;
				}
			}
		}
		
		for (int i = a; i <= b; i++){
			if (i % 2 == 1){
				soma += i;
			}
		}
		
		System.out.print(soma);
	}
}

/*
cls && javac ex02.java && java ex02
*/