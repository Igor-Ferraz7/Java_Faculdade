package lista_ex6;

public class ex2 {
    public static void main(String[] args) {
        System.out.println(sumFractions(4.0));
    }

    public static double sumFractions(Double last_num) {
        if (last_num > 0) {
            return (1 / last_num) + sumFractions(last_num-1);
        }
        return 0;
    }

}
