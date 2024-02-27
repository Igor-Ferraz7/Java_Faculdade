package lista_ex6;

//no final converter o numero para string e concatenar

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o numero a ser convertido: ");
        int n = input.nextInt();
        String n_binary = num_toBinary(n, "");

        System.out.printf("O numero %d em binario e: %s", n, n_binary);
    }

    public static String num_toBinary (int num, String binary_num) {
        if (num >= 1) {
            binary_num += (num % 2);
            int rest = num / 2;

            return num_toBinary(rest, binary_num);
        }
        return new StringBuilder(binary_num).reverse().toString();
    }
}
