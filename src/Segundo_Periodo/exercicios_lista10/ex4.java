package Segundo_Periodo.exercicios_lista10;

public class ex4 {
    public static void main(String[] args){
        System.out.println(fatorial(5));
    }

    static int fatorial(int num){
        for (int i = num - 1; i > 0; i--){
            num *= i;
        }
        return num;

    }

}
