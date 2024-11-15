package Primeiro_Periodo.Atividades_gerais.Atividade02;

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