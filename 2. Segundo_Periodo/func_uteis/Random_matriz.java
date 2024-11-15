package func_uteis;

import func_uteis.Random_vetor;

public class Random_matriz {
    public static void main(String[] args) {

    }

    public static int[][] suffle(int[][] matriz) {
        int[] vetor = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            Random_vetor.suffle(vetor, matriz[0].length);
        }

        return matriz;
    }

}
