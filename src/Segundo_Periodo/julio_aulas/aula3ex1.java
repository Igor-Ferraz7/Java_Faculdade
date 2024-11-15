package Segundo_Periodo.julio_aulas;

import java.util.Scanner;
import java.util.Arrays;

public class aula3ex1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int mat[][] = new int[3][3];
		int count_pair = 0;
		int count_odd = 0;
		
		int qtd_pair = 0;
		int qtd_odd = 0;
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.printf("Posicao [%d][%d]: ", i, j);
				mat[i][j] = input.nextInt();
				
				if (mat[i][j] % 2 == 0) {
					qtd_pair++;
				} else {
					qtd_odd++;
				}
			}
			System.out.println("");
		}
		
		int pair_list[] = new int[qtd_pair];
		int odd_list[] = new int[qtd_odd];
		
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				System.out.print("\t" + mat[i][j]);
				
				if (mat[i][j] % 2 == 0) {
					pair_list[count_pair] = mat[i][j];
					count_pair++;
				} else {
					odd_list[count_odd] = mat[i][j];
					count_odd++;
				}
			}
			System.out.println("");
		}
		
		System.out.println("\nPares:" + Arrays.toString(pair_list) + " Total:" + qtd_pair);
		System.out.println("Impares:" + Arrays.toString(odd_list) + " Total:" + qtd_odd);
		
		input.close();
	}
}
