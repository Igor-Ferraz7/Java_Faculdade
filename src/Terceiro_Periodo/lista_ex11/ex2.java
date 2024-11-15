package Terceiro_Periodo.lista_ex11;/*
Crie um programa que declare um array de inteiros e tente acessar um elemento fora dos
limites do array. Capture a exceção ArrayIndexOutOfBoundsException e forneça a mensagem
de erro: “Erro ao tentar acessar a estrutura. Posição inválida”.
 */

public class ex2 {
    public static void main(String[] args) {
        int[] vet = new int[]{1, 2, 3};

        try {
            System.out.println(vet[123]);
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Erro ao tentar acessar a estrutura. Posicao invalida");
        }
    }
}
