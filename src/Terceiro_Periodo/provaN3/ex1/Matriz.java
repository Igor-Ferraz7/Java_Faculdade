package Terceiro_Periodo.provaN3.ex1;/*
 Crie em Java uma classe chamada Matriz. Essa classe dever� gerar de forma aleat�ria uma matriz de inteiros 5x5
com valores entre 1 e 100, por�m os n�meros n�o podem se repetir. Ap�s gerar e preencher a matriz, dever�o ser
salvos os dados das seguintes c�lulas destacadas(em vermelho) em um
arquivo chamado matriz.txt (este arquivo deve ser salvo na mesma pasta do projeto).

B�nus(+10,0): Utilizar classes separadas para manipular o arquivo e gerar matriz.
        - reomceNums
        - matrizToString
        - saveMatriz
B�nus(+ 5,0): Utilizar construtores nas classes.
B�nus(+ 5,0): Utilizar m�todos especificos (gerar matriz, gerar arquivo, preencher, etc?).
*/


import java.util.Arrays;
import java.util.Random;

public class Matriz {
    public static void main(String[] args) {
        int[][] matriz = createMatriz();
        String stringMatriz = matrizToString(matriz);
        System.out.println(stringMatriz);
    }


    public static String matrizToString(int[][] matriz) {
        String stringMatriz = "";
        String space = "  ";
        String num;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i == j || (i + j == 4)) {
                    num = "  ";
                } else {
                    num = String.valueOf(matriz[i][j]);
                    if (matriz[i][j] < 10) {
                        space += " ";
                    } else if (matriz[i][j] == 100) {
                        space += "\b";
                    }
                }

                stringMatriz += num + space;
                space = "  ";
            }

            stringMatriz += "\n";
        }

        return stringMatriz;

    }


    public static int[][] createMatriz() {
        int[][] matriz = new int[5][5];
        int[] nums = noRepeatNums();
        int count = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = nums[count];
                count++;
            }
        }

        return matriz;

    }

    // numeros aleat�rios que n�o v�o se repetir
    public static int[] noRepeatNums() {
        Random rand = new Random();
        int[] nums = new int[25];

        for (int i = 0; i < nums.length; i++) {
            int randNum = rand.nextInt(1, 101);
            String sRandNum = Arrays.toString(nums);

            if (sRandNum.contains(String.valueOf(randNum))) {
                while (sRandNum.contains(String.valueOf(randNum))) {
                    randNum = rand.nextInt(1, 101);
                    sRandNum = Arrays.toString(nums);
                }
            }
            nums[i] = randNum;
        }

        return nums;

    }

}