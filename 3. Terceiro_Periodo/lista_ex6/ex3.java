package lista_ex6;

/*
Escreva um método que calcule e retorne o N-ésimo número da sequência de Tribonacci,
que é dada pela seguinte função: f(n) = f(n-1)+f(n-2)+f(n-3),
sendo os 7 primeiros número da sequência: 0, 1, 1, 2, 4, 7, 13.

 */

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor de n: ");
        int n = input.nextInt();

        System.out.printf("%d-esimo numero do tribonacci: %d", n, tribonacci(n));
    }

    public static int tribonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n <= 3 && n >= 1) {
            return 1;
        } else if (n >= 4)  {
            return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
        }
        return -n;
    }
}
