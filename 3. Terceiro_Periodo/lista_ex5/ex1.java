package lista_ex5;

/*
Criar uma função recursiva que o usuário informe um valor inteiro e realize a soma de todos
os números naturais pares de 1 até o valor informado pelo usuário.
 */

public class ex1 {
    static int sum = 0;

    public static void main(String[] args) {
        System.out.println(natural_sum(4));
    }

    public static int natural_sum(int last_num) {
        if (last_num >= 1) {
            if (last_num % 2 == 0) {
                sum += last_num;
            }
            return natural_sum(last_num - 1);
        }
        return sum;
    }

}
