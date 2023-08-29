import java.util.Scanner;
public class aula_23{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		p1.nome = "Igor";
		System.out.printf("Olá %s!\n", p1.nome);
		int valor1;
		System.out.printf("Informe um valor: ");
		valor1 = sc.nextInt(); //nextLine para string
		System.out.printf("O valor é: %d", valor1);
	}
}

class Pessoa{
	String nome;
	int idade;
	
	void comprimentar(){
		System.out.printf("Eaiii!!"); //aq utilizamos o void pq não retornaremos algo
	}
	
	//soma(){
	//	int a = 3;
	//	int b = 6;
	//	return a + b;
	//}
}

//javac aula_23.java && java aula_23