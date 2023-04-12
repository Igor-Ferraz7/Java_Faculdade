/*
Neste problema, deve-se ler o código de uma peça 1, o número de peças 1,
 o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
 Após, calcule e mostre o valor a ser pago.

Entrada
O arquivo de entrada contém duas linhas de dados. Em cada linha haverá 3 valores,
 respectivamente dois inteiros e um valor com 2 casas decimais.

Saída
A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo,
 lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".
 O valor deverá ser apresentado com 2 casas após o ponto.
 
ex:
 
 entrada:
  12 1 5.30
  16 2 5.10
 saida:
  VALOR A PAGAR: R$ 15.50
 */
import java.io.IOException;
import java.util.Scanner;

public class pecas {
 
    public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);
		int codigo_peca1, quantidade_peca1, codigo_peca2, quantidade_peca2;
		double valor_peca1, valor_peca2;
		
		codigo_peca1 = ler.nextInt();
		quantidade_peca1 = ler.nextInt();
		valor_peca1 = ler.nextDouble();
				
		codigo_peca2 = ler.nextInt();
		quantidade_peca2 = ler.nextInt();
		valor_peca2 = ler.nextDouble();
		
		double valor_total = quantidade_peca1 * valor_peca1 + quantidade_peca2 * valor_peca2;
		
		System.out.printf("VALOR A PAGAR: R$ %.2f\n", valor_total);
	}
}

/*
cls && javac pecas.java && java pecas
*/