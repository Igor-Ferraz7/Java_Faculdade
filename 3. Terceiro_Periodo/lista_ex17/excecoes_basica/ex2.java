package lista_ex17.excecoes_basica;

/*
Escreva um programa que solicita ao usuário que insira uma idade e verifique se
 é maior que 18 anos. Lide com a exceção de entrada inválida caso o usuário insira
 uma idade não numérica.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        isLess18();
    }

    public static void isLess18() {
        Scanner input = new Scanner(System.in);
         try {
             System.out.print("Digite sua idade: ");
             int age = input.nextInt();
             if (age >= 18) {
                 System.out.println("É maior que 18 anos.");
             } else {
                 System.out.println("Não é maior que 18.");
             }
         } catch (InputMismatchException ime) {
             System.out.println("Digite uma idade numérica.");
         }
    }
}
