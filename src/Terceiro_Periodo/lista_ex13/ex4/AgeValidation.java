package Terceiro_Periodo.lista_ex13.ex4;

/*
Crie uma classe chamada ValidadorDeIdade que contenha um método chamado verificarIdade
 que aceita uma idade como parâmetro. Use throw para lançar uma exceção IdadeInvalidaException
 se a idade for menor que 0. Escreva um programa principal que chama esse método e lida com a exceção.

 */
public class AgeValidation {
    public static void main(String[] agrs) {
        try {
            AgeValidation.ageVerification(-1);
        } catch (InvalidAgeException iae) {
            System.out.println(iae.getMessage()); //Como a msg fica salva quando lançar o erro?
        }
    }

    public static void ageVerification(int age) throws InvalidAgeException{
        if (age < 0) {
            throw new InvalidAgeException("Idade inválida.");
        } else {
            System.out.println("Idade válida");
        }
    }
}
