/*
Faça um algoritmo que, dados três números inteiros, os imprima em ordem
crescente.
*/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ex01{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		List<Integer> lista = new ArrayList<>();
		
		System.out.print("Digite um valor: ");
		int n1 = ler.nextInt();
		System.out.print("Digite outro valor: ");
		int n2 = ler.nextInt();
		System.out.print("Digite mais um valor: ");
		int n3 = ler.nextInt();
		
		lista.add(n1);
		lista.add(n2);
		lista.add(n3);
		
		Collections.sort(lista);
		
		System.out.print("A ordem crescente é: " + lista);
		
		ler.close();
	}
}
//cls && javac ex01.java && java ex01