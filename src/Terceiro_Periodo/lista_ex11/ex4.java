package Terceiro_Periodo.lista_ex11;/*
Crie um programa que divida dois números, um deles lido a partir da entrada de dados pelo
usuário e outro definido por um valor padrão qualquer. Capture as exceções
ArithmeticException se ocorrer uma divisão por zero e InputMismatchException se a entrada
não for um número válido.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n2 = 2;
        int divs = 0;

        try {
            System.out.print("Digite um valor a ser dividido por 2: ");
            int n1 = input.nextInt();
            divs = n1 / n2;

            System.out.println(divs);
        } catch (ArithmeticException ae) {
            System.out.println("\nErro! Não pode dividir por zero.");
        } catch (InputMismatchException ime) {
            System.out.println("\nErro! Numero invalido.");
        }
    }
}
