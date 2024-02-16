package lista_ex3;

public class ex4 {
    public static void main(String[] args) {
        System.out.println(calcularPotencia(3, 3));
        System.out.println(calcularPotencia(4, 2));
    }

    public static int calcularPotencia(int base, int exponent) {
        int power = 1;

        for (int i = 0; i < exponent; i++) {
            power *= base;
        }

        return power;
    }
}
