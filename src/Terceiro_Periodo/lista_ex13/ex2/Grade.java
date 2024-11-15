package Terceiro_Periodo.lista_ex13.ex2;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) throws InvalidGradeException {
        Scanner input = new Scanner(System.in);
        double grade = 0;

        try {
            System.out.print("Insira a nota do aluno: ");
            grade = input.nextDouble();

            if (grade > 10 || grade < 0) {
                throw new InvalidGradeException("Nota invalida");
            }

        } catch (InvalidGradeException ige) {
            System.out.println(ige.getMessage());
        }
    }
}
