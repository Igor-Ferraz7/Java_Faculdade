package Terceiro_Periodo.lista_ex13.ex3;

public class Calculator {

    public static void main(String[] args) {
        try {
            Calculator.division(10, 0); //Por que eu tenho que tratar o erro aqui sendo q vou tratar dentro da fun��o?
        } catch (DivideByZeroException dbze) {
            System.out.println("Erro: " + dbze.getMessage());
        }
    }

    public static void division(int n1, int n2) throws DivideByZeroException {
        if (n2 == 0) {
            throw new DivideByZeroException("Imposs�vel dividir por zero.");
        }
        double d1 = n1 / n2;
        System.out.println("A divis�o �: " + d1);
        }
}