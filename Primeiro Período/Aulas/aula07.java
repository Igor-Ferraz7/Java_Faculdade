import java.util.Scanner;
/*
Ler dois valores (A e B).
Efetuar a soma dos valores A e B.
Implicar o valor da soma em X.
Verificar se X é maior ou igual a 10, caso sim mostre X+5, senão mostre X-7.
*/

public class aula07{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		String sb = "-=";
		System.out.println(sb.repeat(30) + "-");
		System.out.printf("%33s \n", "Aula_07");
		System.out.println(sb.repeat(30) + "-");
		System.out.print("Insira o primeiro valor: ");
		int a = ler.nextInt();
		System.out.print("Insira outro valor: ");
		int b = ler.nextInt();
		int x = a + b;
		if (x >= 10){
			System.out.println("X + 5 = " + (x+5));
		}
		else {
			System.out.println("X + 7 = " + (x+7));
		}
		System.out.println(sb.repeat(30) + "-");
		ler.close();
	}
}
//cls && javac aula07.java && java aula07
