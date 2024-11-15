package Terceiro_Periodo.lista_ex17.excecoes_basica;/*
Escreva um programa que solicita ao usu�rio que insira um n�mero inteiro e imprime o quadrado desse n�mero.
Lide com a exce��o de entrada inv�lida caso o usu�rio insira algo que n�o seja um n�mero inteiro.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        try {
            System.out.print("Digite um n�mero: ");
            int num = input.nextInt();
            squareNum(num);
        } catch (InputMismatchException ime) {
            System.out.println("N�mero inv�lido.");
        }
    }

    public static void squareNum(int num) {
        System.out.printf(" %d� �: %d", num, num*num);
    }

}
