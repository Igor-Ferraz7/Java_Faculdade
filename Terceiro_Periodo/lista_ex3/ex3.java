package lista_ex3;

public class ex3 {
    public static void main(String[] args) {
        encontrarPrimosIntervalo(1, 10);
        encontrarPrimosIntervalo(10, 30);
    }

    public static void encontrarPrimosIntervalo(int start, int end) {

        for (int i = start; i < end; i++) {
            boolean is_prime_number = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0 && i != j) {
                    is_prime_number = false;
                    break;
                }
            }
            if (is_prime_number) {
                System.out.println(i);
            }

        }
    }

}
