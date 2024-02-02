package exercicios_lista7;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/*
 * Crie um programa em Java com uma matriz bidimensional 3X4.
 * Realize o preenchimento da matriz.
 * Após realizar o preenchimento, peça ao usuário qual linha
 * deseja visualizar os dados e imprima a linha desejada.

 */

public class ex5 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		int matriz[][] = new int[3][4];
		int line = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(11);
			}
			
			System.out.println(Arrays.toString(matriz[i]));
			
		}
		
		line = input.nextInt();
		
		System.out.println(Arrays.toString(matriz[line]));
		
		input.close();
	}
}
