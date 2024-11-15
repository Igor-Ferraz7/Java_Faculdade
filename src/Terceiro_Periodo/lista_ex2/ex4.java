package Terceiro_Periodo.lista_ex2;

public class ex4 {
    public static void main(String[] args) {
        is_pair_odd(3);
        is_pair_odd(14);
    }

    public static void is_pair_odd(int num) {
        if (num % 2 == 0) {
            System.out.println("É par.");
        } else {
            System.out.println("É ímpar.");
        }
    }

}
