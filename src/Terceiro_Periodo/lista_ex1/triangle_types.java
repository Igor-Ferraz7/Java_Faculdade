package Terceiro_Periodo.lista_ex1;

public class triangle_types {
    public static void main(String[] args) {
        String triangle = "";
        triangle = type(2, 2, 2);
        System.out.println(triangle);

        triangle = type(2, 2, 3);
        System.out.println(triangle);

        triangle = type(2, 3, 4);
        System.out.println(triangle);

    }

    public static String type(int a, int b, int c) {
        String type_triangle = "";
        if (a == b || a == c) {
            if (b == c) {
                type_triangle = "equilátero";
            } else {
                type_triangle = "isóceles";
            }
        } else {
            type_triangle = "escaleno";
        }

        return type_triangle;
    }

}
