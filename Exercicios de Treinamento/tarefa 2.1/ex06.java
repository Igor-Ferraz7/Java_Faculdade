/*
Um usuário deseja um algoritmo onde possa escolher que tipo de média deseja
calcular a partir de 3 notas. Faça um algoritmo que leia as notas, a opção escolhida
pelo usuário e calcule a média.
a. 1 - Aritmética.
b. 2 - Ponderada (3,3,4)
*/

import java.util.Scanner;

public class ex06{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Diga o valor da primeira nota: ");
		double n1 = ler.nextDouble();
		System.out.print("Diga o valor da segunda nota: ");
		double n2  = ler.nextDouble();
		System.out.print("Diga o valor da terceira nota: ");
		double n3 = ler.nextDouble();
		
		System.out.print("1 - Aritmética\n2 - Ponderada (3, 3, 4)\n--> Escolha o tipo de média desejada: ");
		int tipo_media = ler.nextInt();
		
		if (tipo_media == 1){
			double media = (double) (n1 + n2 + n3) / 3;
			System.out.printf("A média aritmética é: %.2f", media);
		}
		else if (tipo_media == 2){
			double media = (double) (n1*3 + n2*3 + n3*4);
			System.out.printf("A média ponderada é: %.2f", media);
		}
		else{
			System.out.print("O tipo de média solicitada não é válida.");
		}
	}
}

//cls && javac ex06.java && java ex06