/*
Crie um algoritmo que calcule e imprima a soma dos números ímpares
entre 1 e 100.
*/

import java.util.Scanner;

public class ex01{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int count = 1;
		int sum = 0;
		
		while (count <= 100){
			if (count % 2 != 0){
				sum += count;
			}
			
			count += 1;
		}
		
		System.out.print(sum);
	}
}

/*
cls && javac ex01.java && java ex01
*/