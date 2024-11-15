package Terceiro_Periodo.lista_ex2;

public class ex12 {
    public static void main(String[] args) {
        System.out.println(is_pair_odd(10));
        System.out.println(is_pair_odd(11));
    }

    public static String is_pair_odd(int num) {
        if (num % 2 == 0) {
            return "Is pair";
        } else {
            return "Is odd";
        }
    }

}
