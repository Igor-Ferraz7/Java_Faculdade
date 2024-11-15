package lista_ex2;

public class ex6 {
    public static void main(String[] args) {
        pairs_odd_interval(10, 40);
    }

    public static void pairs_odd_interval(int start, int end) {
        System.out.println("Pares:");
        for (int i = start; i < end; i+=2) {
            System.out.println(i);
        }

        System.out.println("\nÍmpares: ");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

}
