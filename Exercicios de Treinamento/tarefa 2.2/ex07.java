/*
Crie um algoritmo em que leia o destino do passageiro, se a viagem inclui retorno
(ida e volta) e informar o preço da passagem conforme a tabela a seguir:
                 Ida    |   Volta
Norte -         500,00     900,00
Nordeste -      350,00     650,00
Centro-Oeste -  350,00     600,00
Sul -           300,00     550,00
*/

import java.util.Scanner;

public class ex07{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		double volta = 0;
		
		System.out.print("Diga seu destino: ");
		String destino = ler.nextLine();
		String destino1  = destino.toUpperCase();
		
		System.out.print("Sua viagem inclui retorno? \n1 - Sim\n2 - Não\n--> ");
		String escolha = ler.nextLine();
		String escolha1 = escolha.toUpperCase();
		
		if (destino1.equals("NORTE")){
			if (escolha1.equals("SIM")){
				volta += 900.00;
			}
			System.out.printf("O preço da passagem é R$%.2f", (500.00 + volta));
		}
		
		else if (destino1.equals("NORDESTE")){
			if (escolha1.equals("SIM")){
				volta += 650.00;
			}
			System.out.printf("O preço da passagem é R$%.2f", (350.00 + volta));
		}
		
		else if (destino1.equals("CENTRO-OESTE")){
			if (escolha1.equals("SIM")){
				volta += 600.00;
			}
			System.out.printf("O preço da passagem é R$%.2f", (350.00 + volta));
		}
		
		else if (destino1.equals("SUL")){
			if (escolha1.equals("SIM")){
				volta += 550.00;
			}
			System.out.printf("O preço da passagem é R$%.2f", (300.00 + volta));
		}
	}
}

//cls && javac ex07.java && java ex07