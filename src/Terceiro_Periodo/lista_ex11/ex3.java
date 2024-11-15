package Terceiro_Periodo.lista_ex11;/*
Crie um programa que solicite ao usuário que digite um número inteiro,
mas capture a exceção NumberFormatException se o que foi digitado não for um número válido.
 */

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Digite um numero: ");
            String number = input.nextLine();
            int value = Integer.parseInt(number);
            System.out.println("Numero: " + value);
        } catch (NumberFormatException nfe) {
            System.out.println("Erro! Numero invalido.");
        }
    }
}
