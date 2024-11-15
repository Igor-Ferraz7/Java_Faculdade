package exercicios_lista10;

public class ex3 {
    public static void main(String[] args){
        System.out.println(conceito(10));
    }

    static String conceito(double media_final){
        if (media_final >= 0 && media_final <= 4.9){
            return "D";
        } else if (media_final >= 5 && media_final <= 6.9){
            return "C";
        } else if (media_final >= 7 && media_final <= 8.9){
            return "B";
        } else if (media_final >= 9 && media_final <= 10){
            return "A";
        } else {
            return "Media invalida";
        }
    }

}
