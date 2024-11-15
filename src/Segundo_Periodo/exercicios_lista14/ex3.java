package Segundo_Periodo.exercicios_lista14;

import Terceiro_Periodo.func_uteis.RandomVetor;

import java.util.Arrays;
import java.util.Scanner;

public class ex3 {
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
        int count_binary = binary_find(num, vetor);
        int count_linear = linear_find(num, vetor);

        System.out.printf("Para a buasca binária foram feitas %d verificações.\n", count_binary);
        System.out.printf("Para a buasca linear foram feitas %d verificações.\n", count_linear);


    }

    static int binary_find(int num, int[] vetor) {
        boolean is_find = false;
        int count = 0;
        int start = 0;
        int end = vetor.length - 1;

        while(start <= end) {
            int middle = (start + end) / 2;
            count++;

            if (vetor[middle] == num) {
                is_find = true;
                break;
            }
            if (vetor[middle] < num) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        return count;

    }

    static int linear_find(int num, int[] vetor) {
        boolean is_finded = false;
        int count = 0;

        for (int i : vetor) {
            count++;
            if (num == i) {
                is_finded = true;
                break;
            }
        }

        return count;

    }
}
