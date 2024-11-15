package Terceiro_Periodo.lista_ex2;

public class ex5 {
    public static void main(String[] args) {
        tables_book(7);
    }

    public static void tables_book(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d x %d = %d\n", num, i, num*i);
        }
    }

}
