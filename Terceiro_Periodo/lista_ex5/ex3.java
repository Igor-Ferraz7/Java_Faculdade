package lista_ex5;

/*
Criar uma função recursiva para calcular a potência de um número.
O usuário deverá informar os valores da base e do expoente.
Por exemplo:
	3^2 = 9;
	2^0 = 1;
 */

public class ex3 {
    public static void main(String[] args) {
        System.out.println(power(3, 3));
        System.out.println(power(9, 0));
        System.out.println(power(4, 1));
    }

    public static int power(int base, int exponent) {
        if (exponent > 0) {
            return base * power(base, exponent - 1);
        }
        return 1;
    }

}
