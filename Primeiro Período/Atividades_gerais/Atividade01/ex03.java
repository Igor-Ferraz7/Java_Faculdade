package Atividades_gerais.Atividade01;//Crie um algoritmo em Java que leia o valor de um produto e o valor do desconto em porcentagem a ser aplicado, e exiba o valor do produto com desconto.
import java.util.Scanner;
public class ex03{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		String t = "-=";
		String tt = "Terceiro exercício";
		System.out.print(t.repeat(30) + "- \n");
		System.out.printf("%40s \n", tt);
		System.out.print(t.repeat(30) + "- \n");
		System.out.print("Diga o valor do produto: R$");
		String produto = ler.nextLine();
		produto = produto.replace(",", ".");
		float produtof = Float.parseFloat(produto);
		System.out.print("Digite o valor do desconto em porcentagem: ");
		String desconto = ler.nextLine();
		desconto = desconto.replace("%", "");
		int descontoI = Integer.parseInt(desconto);
		float produto_com_desconto = produtof-produtof*(descontoI/100f);
		System.out.printf("O valor R$%.2f com desconto de %d%s é R$%.2f", produtof, descontoI, "%", produto_com_desconto);
		System.out.print("\n" + t.repeat(30) + "- \n");
	}
}

// javac ex03.java && java ex03