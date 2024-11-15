package Terceiro_Periodo.func_uteis;

public class Random_matriz {
    public static void main(String[] args) {

    }

    public static int[][] suffle(int[][] matriz) {
        int[] vetor = new int[matriz[0].length];
        for (int i = 0; i < matriz.length; i++) {
            RandomVetor.suffle(vetor, matriz[0].length);
        }

        return matriz;
    }

}
