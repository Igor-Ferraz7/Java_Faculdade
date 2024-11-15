package lista_ex8;

/*
2 Escreva uma função de busca binária utilizando o vetor do exercício 1,
para que retorne o peso e uma específica idade, e retorna o índice do dado com o
menor peso referente à faixa da idade fornecida.
Por exemplo, para o vetor ordenado da questão anterior e idade = 20, a função retorna o índice 2, que
corresponde à estrutura {20,30}.

{18,60},{18,65},{20,30},{20,40},{20,65},{25,50},{30,40},{30,45}

*/

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matriz = {
                {18,60},{18,65},{20,30},{20,40},{20,65},{25,50},{30,40},{30,45}
        };

        System.out.print("Idade: ");
        int age = input.nextInt();

        binary_find(age, matriz);

    }

    static int find_num_pos(int num, int[][] matriz) {
        int num_pos = 0;
        for (int i = 0; i < matriz.length; i++) {
            if (matriz[i][0] == num) {
                num_pos = i;
            }
        }
        return num_pos;
    }

    static void binary_find(int num, int[][] matriz) {
        int smallest_pos = find_num_pos(num, matriz);
        int start = 0;
        int middle = 0;
        int end = matriz.length - 1;
        boolean is_find = false;
        long start_time = System.nanoTime();

        while (start <= end) {
            middle = (start + end) / 2;

            if (matriz[middle][0] == num) {
                for (int i = 0; i < matriz.length - 1; i++){
                    boolean are_equal_num = matriz[i][0] == num && matriz[i+1][0] == num;
                    System.out.printf("{%d, %d}\n", matriz[i][0], matriz[i][1]);

                    if (are_equal_num) {
                        if (matriz[i][1] < matriz[i+1][1] && matriz[i][1] < matriz[smallest_pos][1]) {
                            smallest_pos = i;
                        } else if (matriz[i+1][1] < matriz[i][1] && matriz[i+1][1] < matriz[smallest_pos][1]) {
                            smallest_pos = i+1;
                        }
                    }
                }
                is_find = true;
                break;
            }
            if (matriz[middle][0] < num) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        if (is_find) {
            System.out.printf("Encontrado no índice[%d]. {%d, %d}", smallest_pos, matriz[smallest_pos][0], matriz[smallest_pos][1]);
        } else {
            System.out.println("Não foi encontrado");
        }

    }
}
