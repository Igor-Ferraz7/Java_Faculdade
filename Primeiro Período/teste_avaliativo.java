import java.util.Scanner;

public class teste_avaliativo{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int balance, option, pin, try_pin, tries, qnt, cont;
		option = pin = try_pin = tries = qnt = cont = 0;
		balance = 50;
		
		while (tries < 3){
			System.out.println("#### MÁQUINA DE REFRIGERANTES ####");
			System.out.println("\n            -=MENU=-\n");
			System.out.println("1 - Comprar refrigerante\n2 - Recarregar saldo\n3 - Consultar saldo");
			System.out.println("4 - Cadastrar/Alterar PIN\n0 - Sair\n");
			System.out.print("Selecione a opção: ");
			option = ler.nextInt();
			
			if (option != 0 && option != 4 && pin == 0){
				System.out.println("Ação não aceita.\nPrimeiramente cadastre o pin.\n");
				continue;
			}
			
			while (option != 0 && cont != 0){
				tries = 0;
				System.out.print("Insira o PIN: ");
				try_pin = ler.nextInt();
			
				if (try_pin == pin){
					System.out.print("Acesso permitido.");
					break;
				}
				
				else{
					System.out.println("Acesso negado. PIN digitado incorretamente.");
					tries += 1;
				}
			}
			
			switch (option){
				case 0:
					System.out.print("Obrigado por usar nossa máquina de refrigerantes :)");
					break;
					
				case 1:
					if (balance >= 5){
						System.out.println("Refrigerante comprado com sucesso!");
						balance -= 5;
					}
					else{
						System.out.print("Saldo insuficiente, não será possível comprar mais refrigerante.");
					}
					continue;
					
				case 2:
					System.out.print("Insira a quantia que queira adicionar: ");
					qnt = ler.nextInt();
					
					if (qnt != 10 && qnt != 20 && qnt != 50 && qnt != 100){
						System.out.println("Recarregamento inválido.");
						System.out.println("Selecione apenas um dos seguintes valores: 10, 20, 50 ou 100: ");
					}
					else{
						balance += qnt;
					}
					continue;
					
				case 3:
					System.out.printf("Seu saldo atual é: R$%d,00\n", balance);
					continue;
					
				case 4:
					System.out.print("Insira o pin que deseja salvar: ");
					pin = ler.nextInt();
					try_pin = pin;
					continue;
			}
			
			cont += 1;
			break;
		}
		
	}
}

/*
cls && javac teste_avaliativo.java && java teste_avaliativo
*/