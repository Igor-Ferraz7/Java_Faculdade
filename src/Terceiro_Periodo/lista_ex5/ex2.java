package Terceiro_Periodo.lista_ex5;/*
Criar uma função recursiva que receba um array de inteiros e retorne a soma de
todos os seus elementos.
 */

public class ex2 {
    public static void main(String[] agrs) {
        int[] vector = new int[]{1, 2, 3, 4};

        System.out.println(sumArrayElements(vector, 0));
    }

    public static int sumArrayElements(int[] vector, int i) {
        if (i < vector.length) {
            return vector[i] + sumArrayElements(vector, i+1);
        }
        return 0;
    }

}
