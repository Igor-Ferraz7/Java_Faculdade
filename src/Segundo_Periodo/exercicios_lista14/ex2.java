package Segundo_Periodo.exercicios_lista14;

import Terceiro_Periodo.func_uteis.RandomVetor;

import java.util.Arrays;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        RandomVetor rand_vetor = new RandomVetor();
        Scanner input = new Scanner(System.in);

        int[] vetor = new int[100];
        rand_vetor.suffle(vetor, 100);

        int aux = 0;

        for (int i = 0; i < vetor.length; i++) {
            for (int count = 0; count < vetor.length - 1; count++) {
                if (vetor[count] > vetor[count+1]) {
                    aux = vetor[count+1];
                    vetor[count+1] = vetor[count];
                    vetor[count] = aux;
                }
            }
        }

        System.out.println(Arrays.toString(vetor));
        System.out.println("Qual número deseja procurar? ");
        int num = input.nextInt();

        linear_find(vetor, num);

    }

    static void linear_find(int[] vetor, int num) {
        boolean is_finded = false;

        for (int i : vetor) {
            if (num == i) {
                is_finded = true;
                break;
            }
        }

        if (is_finded) {
            System.out.println("O valor consta no vetor.");
        } else {
            System.out.println("O valor não consta no vetor.");
        }

    }

}
