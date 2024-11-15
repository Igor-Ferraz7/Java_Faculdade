package exercicios_lista9;

/*
Criar uma função que receberá um valor inteiro positivo. A função
deverá calcular o número fatorial dele ou 0 caso o valor informado
for negativo ou zero.
 */

public class ex4 {
    public static void main(String[] args){
        System.out.println(fatorial(6));
        System.out.println(double_num(3));
        System.out.println(pair_odd(12));
        System.out.println(absolute_value(12));
    }

    public static int fatorial(int num){

        if (num <= 0){
            num = 0;
        } else {
            for (int i = num - 1; i > 0; i--){
                num *= i;
            }
        }
        return num;
    }

    public static int double_num(int num){
        num *= 2;
        return num;
    }

    public static String pair_odd(int num){
        if (num % 2 == 0){
            return "pair";
        } else {
            return "odd";
        }
    }

    public static int absolute_value(int num){
        if (num < 0){
            num *= -1;
        }

        return num;

    }

}
