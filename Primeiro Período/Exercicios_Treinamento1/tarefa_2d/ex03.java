import java.util.Scanner;

public class ex03{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int n;
		
		do{
			n = ler.nextInt();
			for (int i = n - 1; i >= 1; i--){
				n *= i;
			}
			System.out.println(n);
		}
		while(n >= 0);
	}
}

/*
cls && javac ex03.java && java ex03
*/