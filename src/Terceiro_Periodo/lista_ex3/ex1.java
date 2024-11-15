package Terceiro_Periodo.lista_ex3;/*
1) Crie um método chamado verificarPalindromo que aceita uma string como parâmetro e retorna true se a string
for um palíndromo (ou seja, pode ser lida da mesma forma da esquerda para a direita e vice-versa),
e false caso contrário.
 */

public class ex1 {
    public static void main(String[] args) {
        String word = "Igor";
        String word2 = "Ana";

        System.out.println(verificarPalindromo(word));
        System.out.println(verificarPalindromo(word2));
    }

    public static boolean verificarPalindromo(String word) {
        String reverse_word = "";
        word = word.toLowerCase();

        for (int i = word.length()-1; i >= 0; i--) {
            reverse_word += word.charAt(i);
        }

        return word.equals(reverse_word);
    }
}
