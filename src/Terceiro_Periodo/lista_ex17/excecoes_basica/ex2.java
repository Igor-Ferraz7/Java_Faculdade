package Terceiro_Periodo.lista_ex17.excecoes_basica;/*
Escreva um programa que solicita ao usu�rio que insira uma idade e verifique se
 � maior que 18 anos. Lide com a exce��o de entrada inv�lida caso o usu�rio insira
 uma idade n�o num�rica.
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
                 System.out.println("� maior que 18 anos.");
             } else {
                 System.out.println("N�o � maior que 18.");
             }
         } catch (InputMismatchException ime) {
             System.out.println("Digite uma idade num�rica.");
         }
    }
}
