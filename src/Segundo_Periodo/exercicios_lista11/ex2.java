package Segundo_Periodo.exercicios_lista11;

import java.util.Scanner;

/*
Faça um programa que leia a altura e o sexo (codificado da seguinte forma:
F-feminino M-masculino) de uma pessoa. Depois faça uma função chamada PesoIdeal
que receba a altura e o sexo via parâmetro e que calcule e retorne seu peso ideal,
utilizando as seguintes fórmulas:
• para homens : (72.7 * h) – 58
• para mulheres : (62.1 * h) – 44.7
Observação: Altura = h (na fórmula acima)
 */

public class ex2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double altura;
        char sexo;

        System.out.print("Altura: ");
        altura = input.nextDouble();

        System.out.print("Sexo (F-feminino M-masculino): ");
        sexo = input.next().toUpperCase().charAt(0);

        System.out.printf("Peso Ideal: %.2f.\n", peso_ideal(altura, sexo));
    }

    public static double peso_ideal(double h, char sexo){
        if (sexo == 'M') {
            return (72.7 * h) - 58;
        }
        else if (sexo == 'F') {
            return (62.1 * h) - 44.7;
        } else {
            return 0;
        }
    }
}
