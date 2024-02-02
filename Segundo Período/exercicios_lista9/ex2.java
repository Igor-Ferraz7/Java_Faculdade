package exercicios_lista9;

public class ex2 {
    public static void main(String[] agrs){
        pair_odd(11);
        tabuada(9);
        odds(14, 27);
        pairs(27, 34);

    }

    static void pair_odd(int num){
        if (num % 2 == 0){
            System.out.println("Is pair");
        } else{
            System.out.println("Is odd");
        }
    }

    static void tabuada(int num){
        for (int i = 1; i <= 10; i++){
            System.out.printf("%d x %d = %d\n", i, num, i*num);
        }
    }

    static void odds(int start, int end){
        System.out.print("Odds: ");
        for (int i = start; i < end; i++){
            if (i % 2 != 0){
                System.out.printf("%d, ", i);
            }
        }

        System.out.println("");

    }

    static void pairs(int start, int end){
        System.out.print("Pairs: ");
        for (int i = start; i < end; i++){
            if (i % 2 == 0){
                System.out.printf("%d, ", i);
            }
        }
    }
}
