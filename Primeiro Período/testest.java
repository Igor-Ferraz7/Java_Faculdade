/*
A sua idade e encontre o ano de nascimento do usuário;
Em seguida, veriﬁque se o usuário nasceu antes do ano 2000 e mostre a quantidade de números múltiplos de 4 entre o intervalo 1 e a idade;
Caso contrário mostre a quantidade de números ímpares entre 1 e a idade.
*/

import java.util.Scanner;

public class testest{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int m = 1, n = 1;
		
		for (int i = 0; i < 5; i++) {
			if (i % 2 == 0) {
				m += n;
			}
			else {
				n += m;
			}
		}
		
		System.out.print(n);
	}
}

/*
cls && javac testest.java && java testest
*/