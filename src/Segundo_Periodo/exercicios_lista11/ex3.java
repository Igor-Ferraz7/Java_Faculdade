package Segundo_Periodo.exercicios_lista11;

import java.util.Scanner;

// Palindromo

public class ex3 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String input_word;

        System.out.print("Digite a palavra: ");
        input_word = input.next();

        System.out.println(is_palindrome(input_word));

    }

    public static String is_palindrome(String word) {
        String inverted_word = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            inverted_word += word.charAt(i);
        }

        if (word.equals(inverted_word)) {
            return "É um palíndromo.";
        } else {
            return "Não é um palíndromo.";
        }
    }

}
