package Segundo_Periodo.exercicios_lista9;

public class ex3 {
    public static void main(String[] args){
        System.out.println(square(7));
        System.out.println(HelloWorld());
        System.out.println(is_three_multiple(7));
    }

    public static int square(int num){
        num *= num;
        return num;
    }

    public static String HelloWorld(){
        return "Hello world!";
    }

    public static boolean is_three_multiple(int num){
        boolean is_multiple = false;

        if (num % 3 == 0){
            is_multiple = true;
        }

        return is_multiple;

    }

}
