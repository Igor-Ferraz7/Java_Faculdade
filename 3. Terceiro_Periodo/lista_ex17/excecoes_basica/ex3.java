package lista_ex17.excecoes_basica;

/*
Crie um programa que recebe duas Strings do usuário e concatena-as.
Lide com a exceção de entrada nula.
 */

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        concatStrings();
    }

    public static void concatStrings() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma String: ");
        String str1 = input.nextLine();

        String str2 = null;

        System.out.println(str1+str2);

    }

}
