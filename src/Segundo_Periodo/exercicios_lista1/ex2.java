package Segundo_Periodo.exercicios_lista1;

import java.util.Random;
import java.util.Scanner;
/*
 * Crie um vetor do tipo inteiro com tamanho 15 e preencha-o com valores aleatórios entre 0 e
50. Após isso, o usuário deverá informar um valor inteiro entre 0 e 50. Caso esse valor esteja
dentro do vetor, o programa deverá exibir a posição em que esse número foi encontrado.
Caso não encontre, informe a mensagem "Valor não encontrado". Se o usuário informar um
valor inválido, informar uma mensagem de erro de "Valor inválido. Informe novamente." e
informe um novo valor.
3.
 */

public class ex2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random();
		
		int rand_num_list[] = new int[15];
		String input_value = "";
		int index = 0;
		int converted_value = 0;
		
		boolean is_inside = false;
		
		for (int i = 0; i < rand_num_list.length; i++) {
			rand_num_list[i] = rand.nextInt(51);
			//System.out.println(rand_num_list[i]);
		}
		
		do {
			System.out.print("Insira um valor de 0 a 50: ");
			input_value = input.nextLine();
			
			try {
				converted_value = Integer.parseInt(input_value);
			} catch (NumberFormatException e){
				System.out.println("Valor invalido. Informe novamente.");
				continue;
				
			}
			
			for (int i = 0; i < rand_num_list.length; i++) {
				if (converted_value == rand_num_list[i]) {
					is_inside = true;
					index = i;
					break;
				}
			}
			
			if (is_inside) {
				System.out.printf("O numero %d foi encontrado na posicao [%d]!", converted_value, index);
				break;
			}
			
			else {
				System.out.println("Valor nao encontrado.");
				break;
			}
		} while(true);
		
		input.close();
	}
}
