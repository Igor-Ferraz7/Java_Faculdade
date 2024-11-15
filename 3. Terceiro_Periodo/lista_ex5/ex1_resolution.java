package lista_ex5;

/*
Criar uma função recursiva que o usuário informe um valor inteiro e realize a soma de todos
os números naturais pares de 1 até o valor informado pelo usuário.
 */

public class ex1_resolution {
    static int sum = 0;

    public static void main(String[] args) {
        System.out.println(naturalSum(4));
    }

    public static int naturalSum(int lastNum) {
        if (lastNum < 1) {
            return 0;
        }

        if (lastNum % 2 == 0) {
            return lastNum + naturalSum(lastNum - 1);
        }

        return naturalSum(lastNum - 1);
    }

}
