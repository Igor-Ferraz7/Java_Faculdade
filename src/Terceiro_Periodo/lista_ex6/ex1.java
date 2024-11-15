package Terceiro_Periodo.lista_ex6;

public class ex1 {
    public static void main(String[] args) {
        int result = sumNumbers(8);
    }

    public static int sumNumbers(int last_num) {
        int sum = 0;
        for (int i = 0; i <= last_num; i++) {
            sum += i;
        }
        return sum;
    }
}
