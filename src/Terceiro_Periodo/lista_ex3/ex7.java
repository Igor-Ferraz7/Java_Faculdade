package Terceiro_Periodo.lista_ex3;/*
7) Crie um método que calcule a tetração de um número. O método deverá receber dois valores
como argumentos do tipo inteiro, sendo eles base(entre 1 e 7) e altura(entre 2 e 4).
A tetração é dada da seguinte forma:	ab , onde b é a base e a sendo a altura.
	Exemplos:
        ³2 = 222= 24 = 16
        ³3 = 333 = 327 = 7.625.597.484.987
 */

public class ex7 {
    public static void main(String[] args) {
        number_tritation(4, 3);
    }

    public static void number_tritation(int base, int height) {
        int exponent = 1;
        long power = 1L;

        for (int i = 0; i < base; i++) {
            exponent *= base;
        }

        System.out.println(exponent);

        for (int i = 0; i < exponent; i++) {
            power *= base;
        }

        System.out.println(power);
        System.out.println(7625597484987L);

    }

}
