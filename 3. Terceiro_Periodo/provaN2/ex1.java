package provaN2;

public class ex1 {
    public static void main(String[] args) {

        pell_sequence(8);

    }

    static void pell_sequence(int n) {
        System.out.print("0, 1, ");
        int p1 = 0;
        int p2 = 1;

        for (int i = 0; i < n - 2; i++) {
            int aux = p2;
            p2 = 2*p2 + p1;
            p1 = aux;
            System.out.printf("%d, ", p2);
        }
    }
}
