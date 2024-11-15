package Terceiro_Periodo.lista_ex6;/*
Escreva um método recursivo que calcule o N-ésimo número da sequência de Pell,
que é dada pela seguinte fórmula: P(n) = 2P(n-1)+P(n-2),
sendo os primeiros números da sequência 0 e 1, respectivamente.
        // 0  1  2  5  12
        // 1  2  3  4  5 <- n
 */

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o n-esimo numero a ser mostrado da sequencia pell: ");

        int n = input.nextInt();
        int n_esimo = pellSequence(n);

        System.out.printf("O %d-esimo numero: %d", n, n_esimo);
    }

    public static int pellSequence(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n > 2) {
            return (2 * pellSequence(n - 1)) + pellSequence(n - 2);
        }
        return n;
    }
}
