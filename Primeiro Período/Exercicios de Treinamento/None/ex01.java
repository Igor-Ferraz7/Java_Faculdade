import java.util.Scanner;

public class ex01{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int n;
		
		n = input.nextInt();
		
		for (int i = n; i != 1; i += 0){
			if (i % 2 == 0){
				i /= 2;
			}
			
			else{
				i = i * 3 + 1;
			}
			
			System.out.println(i);
		}
	}
}
/*
cls && javac ex01.java && java ex01
*/