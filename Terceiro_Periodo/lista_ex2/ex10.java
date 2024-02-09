package lista_ex2;

public class ex10 {
    public static void main(String[] args) {
        System.out.println(fatorial(5));
    }

    public static int fatorial(int num) {
        if (num <= 0) {
            return 0;
        } else {
            for (int i = num - 1; i >= 1; i--) {
                num *= i;
            }

            return num;
        }
    }

}
