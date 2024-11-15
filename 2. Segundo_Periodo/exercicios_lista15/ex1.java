package exercicios_lista15;

import java.util.Scanner;

public class ex1 {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int[] vet = new int[]{1, 3, 4, 5, 1, 2, 9, 6};

        System.out.print("Escolha um valor para ser encontrado: ");
        int value = input.nextInt();

        lienar_search(vet, value);

    }

    static void lienar_search(int[] vetor, int num) {
        boolean is_find = false;
        int count = 0;

        while (count < vetor.length) {
            if (vetor[count] == num) {
                is_find = true;
                break;
            } else {
                count++;
            }
        }

        if (is_find) {
            System.out.println("O valor foi encotrado no vetor.");
        } else {
            System.out.println("O valor não foi encotrado no vetor.");
        }

    }

}
