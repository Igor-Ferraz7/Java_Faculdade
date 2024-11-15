package Primeiro_Periodo.Exercicios_Treinamento1.tarefa_2d;/*
Crie um algoritmo que simule a autenticação de um usuário. O usuário
deverá informar seu nome de usuário ("admin") e sua senha ("1234"). O
programa deverá verificar se o nome de usuário e a senha estão
corretos. Se estiverem, imprima "Bem-vindo, admin!". Se não estiverem,
peça ao usuário para inserir o nome de usuário e a senha novamente,
até que sejam inseridos corretamente.
*/

import java.util.Scanner;

public class tst{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int Joaquim, Joao_Luz, Maria, option;
		String winner;
		double Null, White, total;
		
		Joaquim = Joao_Luz = Maria = option = 0;
		Null = White = 0.0;
		
		
		while(option != 6){
			System.out.print("Insira seu voto: ");
			option = ler.nextInt();
			
			System.out.println("As opções são: ");
			System.out.println("	1. Candidato Joaquim");
			System.out.println("	2. Candidato Joao Luz");
			System.out.println("	3. Candidato Maria");
			System.out.println("	4. Nulo");
			System.out.println("	5. Branco");
			
			switch(option){
				case 1:
					Joaquim += 1;
					break;
				case 2:
					Joao_Luz += 1;
					break;
				case 3:
					Maria += 1;
					break;
				case 4:
					Null += 1;
					break;
				case 5:
					White += 1;
					break;
			}
			
		}
		
		total = Joao_Luz + Joaquim + Maria + Null + White;
		
		if (Null == 0 && White == 0){
			Null = White;
		}
		else{
			Null = (Null * 100) / total;
			White = (White * 100) / total;
		}
		
		if(Joaquim > Joao_Luz && Joaquim > Maria){
			winner = "Joaquim";
		}
		else if(Joao_Luz > Joaquim && Joao_Luz > Maria){
			winner = "João Luz";
		}
		else if (Maria > Joao_Luz && Maria > Joaquim){
			winner = "Maria";
		}
		else{
			winner = "sem vencedor";
		}
		
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.printf("Quantidade de votos de Joaquim: %d\n", Joaquim);
		System.out.printf("Quantidade de votos de João Luz: %d\n", Joao_Luz);
		System.out.printf("Quantidade de votos de Maria: %d\n", Maria);
		System.out.printf("Porcentagem de votos nulos: %.0f\n", Null);
		System.out.printf("Porcentagem de votos brancos: %.0f\n", White);
		System.out.printf("Vencedor: %s.", winner);
		
	}
}

/*
cls && javac tst.java && java tst
*/