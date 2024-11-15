package Terceiro_Periodo.lista_ex11;/*
Crie um programa que declare uma variável e inicialize-a como null e tente acessar o método
para pegar o tamanho dessa variável. Use um bloco try-catch para capturar a exceção
NullPointerException e exiba uma mensagem de erro: “Impossível utilizar um método de uma
variável nula”.
 */

public class ex1 {
    public static void main(String[] args) {
        String value = null;

        try {
            System.out.println(value.length());
        } catch (NullPointerException npe) {
            System.out.println("Impossivel utilizar um metodo de uma variavel nula.");
        }
    }
}
