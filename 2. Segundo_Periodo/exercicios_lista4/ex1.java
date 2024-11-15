package exercicios_lista4;

import java.util.Random;
import java.util.Arrays;

public class ex1 {
	public static void main(String[] args0) {
		Random rand = new Random();
		int matriz[][] = new int[5][6];
		int biggest_num = 0;
		int shortest_num = 50;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = rand.nextInt(51);
			}
			System.out.println(Arrays.toString(matriz[i]));
		}
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length - 1; j++) {
				if (biggest_num < matriz[i][j]) {
					biggest_num = matriz[i][j];
				}

				if (shortest_num > matriz[i][j]) {
					shortest_num = matriz[i][j];
				}
			}
		}
		
		System.out.printf("\nValor maximo: %d\n", biggest_num);
		System.out.printf("Valor minimo: %d", shortest_num);
		
	}
}
