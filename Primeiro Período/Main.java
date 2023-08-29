/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lê o valor do tempo em segundos
        int tempoSegundos = sc.nextInt();

        // Converte o tempo em segundos para horas, minutos e segundos
        int horas = tempoSegundos / 3600;
        int minutos = (tempoSegundos % 3600) / 60;
        int segundos = tempoSegundos % 60;

        // Imprime o tempo no formato horas:minutos:segundos
        System.out.printf("%d:%02d:%02d%n", horas, minutos, segundos);

        sc.close();
    }
}
*/
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner ler = new Scanner(System.in);
		int contadorImpares = 0;
		for (int i = 1; i <= 3; i++) {
			for (int j = 1; j <= 5; j++) {
				if ((i * j) % 2 != 0) {
					contadorImpares++;
		
		System.out.print(contadorImpares);
        }
    }
}
		/*
        int a, b;
		
		a = ler.nextInt();
		b = ler.nextInt();
		
		if (a > b){
			for (int i = 1; i < 2; i++){
				System.out.println("a não pode ser maior que b.");
				System.out.print("Digie seu valor novamente: ");
				a = ler.nextInt();
				if (a > b){
					i -= 1;
				}
			}
		}
		
		for (int i = a + 1; i <= b; i++){
			System.out.println(a);
			a += i;
		}
		
		System.out.print(a);
		*/
	}
}
/*
cls && javac Main.java && java Main
*/