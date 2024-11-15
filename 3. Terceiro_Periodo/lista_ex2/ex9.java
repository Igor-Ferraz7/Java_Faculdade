package lista_ex2;

public class ex9 {
    public static void main(String[] args) {
        System.out.println(is_3_multiple(3));
        System.out.println(is_3_multiple(10));

    }

    public static boolean is_3_multiple(int num) {
        return num % 3 == 0;
    }

}
