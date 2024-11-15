package Segundo_Periodo.exercicios_lista15;

/*
2 - Faça um programa que use o método de busca binária para encontrar e imprimir a
posição de um determinado elemento no vetor. Se o elemento não existir, seu
programa deve imprimir o valor -1. Vetor mínimo de 50 posições preenchido automaticamente.

Ex.
Digite a quantidade de elementos do vetor: 5
Digite o elemento procurado: 3
Posição do elemento procurado: 2

Digite a quantidade de elementos do vetor: 5
Digite o elemento procurado: 3
Posição do elemento procurado: -1

 */
public class ex3 {
    public static void main(String[] agrs) {
        int[] vetor = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        binary_find(10, vetor);

    }

    static void binary_find(int num, int[] vetor) {
        boolean is_find = false;
        int start = 0;
        int end = vetor.length - 1;
        int discard_elements = 0;


        while(start <= end) {
            int middle = (start + end) / 2;
            discard_elements = middle;

            System.out.printf("Foram discartado(s) %d elemento(s)\n", discard_elements);

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

        if (is_find) {
            System.out.println("O valor consta no vetor.");
        } else {
            System.out.println("O valor não consta no vetor.");
        }
    }

}
