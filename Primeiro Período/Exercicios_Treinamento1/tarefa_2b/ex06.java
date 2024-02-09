/*
Crie um algoritmo que, dados o tamanho de três lados informados pelo usuário,
verifique se: (1) é um triângulo isósceles, (2) é equilátero, (3) é escaleno ou (4) não é
um triângulo
*/

import java.util.Scanner;

public class ex06{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o primeiro lado de um triângulo: ");
		double lado1 = ler.nextDouble();
		System.out.print("Informe o segundo lado: ");
		double lado2 = ler.nextDouble();
		System.out.print("Informe o terceiro lado: ");
		double lado3 = ler.nextDouble();
		
		if (lado1 == 0 || lado2 == 0  || lado3 == 0){
			System.out.print("Isso não é um triângulo.");
		}
		
		else if (lado1 == lado2 && lado1 == lado3){
			System.out.print("Triângulo equilátero.");
		}
		
		else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
			System.out.print("Triângulo isósceles.");
		}
		
		else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3){
			System.out.print("Triângulo escaleno.");
		}
		
		else{
			System.out.print("Isso não é um triângulo.");
		}
	}
}

// cls && javac ex06.java && java ex06