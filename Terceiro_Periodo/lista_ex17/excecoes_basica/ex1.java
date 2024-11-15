package lista_ex17.excecoes_basica;

/*
Escreva um programa que solicita ao usuário que insira um número inteiro e imprime o quadrado desse número.
Lide com a exceção de entrada inválida caso o usuário insira algo que não seja um número inteiro.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        try {
            System.out.print("Digite um número: ");
            int num = input.nextInt();
            squareNum(num);
        } catch (InputMismatchException ime) {
            System.out.println("Número inválido.");
        }
    }

    public static void squareNum(int num) {
        System.out.printf(" %d² é: %d", num, num*num);
    }

}
