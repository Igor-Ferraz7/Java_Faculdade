package exercicios_lista11;

import java.util.Scanner;

/*
Faça uma função para uma calculadora de um determinado valor, onde o usuário
vai digitar a operação entre SOMA, SUBTRAÇÃO, MULTIPLICAÇÃO e DIVISÃO,
em seguida será solicitado o PRIMEIRO e o SEGUNDO valor. A função deve
retornar o calculo escolhido por esses valores.
 */

public class ex1 {
    public static void main(String[] args){
        Scanner input =  new Scanner(System.in);
        System.out.print("Digite a operação desejada: ");
        String option = input.next().toUpperCase();

        System.out.print("Digite o valor 1: ");
        int value1 = input.nextInt();

        System.out.print("Digite o valor 2: ");
        int value2 = input.nextInt();

        System.out.println(calculate(option, value1, value2));

    }

    public static double calculate(String operation, double n1, double n2){
        double result = 0;
        switch (operation) {
            case "SOMA" -> result = n1 + n2;
            case "SUBTRAÇÃO" -> result = n1 - n2;
            case "MULTIPLICAÇÃO" -> result = n1 * n2;
            case "DIVISÃO" -> result = n1 / n2;
            default -> {
            }
        }

        return result;

    }

}
