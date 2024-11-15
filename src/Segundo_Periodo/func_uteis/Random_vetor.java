package Segundo_Periodo.func_uteis;

import java.util.Random;

public class Random_vetor {
    static Random rand = new Random();
    public static void main(String[] args) {
    }

    public static int[] suffle(int[] vetor, int range) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = rand.nextInt(range+1);
        }

        return vetor;
    }

}
