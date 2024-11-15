package Primeiro_Periodo.Exercicios_Treinamento1.tarefa_2d;/*
Crie um algoritmo que simule a autenticação de um usuário. O usuário
deverá informar seu nome de usuário ("admin") e sua senha ("1234"). O
programa deverá verificar se o nome de usuário e a senha estão
corretos. Se estiverem, imprima "Bem-vindo, admin!". Se não estiverem,
peça ao usuário para inserir o nome de usuário e a senha novamente,
até que sejam inseridos corretamente.
*/

import java.util.Scanner;

public class ex02{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		String user_name, password;
		
		boolean conditional = true;
		
		while (conditional){
			user_name = ler.nextLine();
			password = ler.nextLine();
			conditional = !user_name.equals("admin") || !password.equals("1234");
			
			if (conditional != false){
				System.out.println("Usuário/senha está incorreto.");
			}
		}
		
		System.out.print("Bem-vindo, admin!");

	}
}

/*
cls && javac ex02.java && java ex02
*/