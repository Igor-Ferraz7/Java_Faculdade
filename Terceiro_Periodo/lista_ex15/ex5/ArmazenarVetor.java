package lista_ex15.ex5;

/*
Crie uma classe chamada ArmazenarVetor que contenha uma função em Java que contenha um vetor
de inteiros 8x8 que deverá ser preenchido com valores aleatórios. Crie métodos que salvem somente
os dados destacados abaixo(de vermelho) em seus respectivos arquivos. Obs.: Os valores do vetor
serão preenchidos aleatoriamente entre 0 e 99.
 */

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Random;

public class ArmazenarVetor {
    public static void main(String[] args) {
        int[][] matriz = randomMatriz();

        for (int i = 0; i < matriz.length; i++) {
            System.out.println(Arrays.toString(matriz[i]));
        }

        int[] values = saveValues(matriz);
        saveInFile(values);

    }

    public static int[] saveValues(int[][] matriz) {
        int[] values = new int[8];
        int index = 0;
        int lastIndex = 7;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    values[index] = matriz[i][j];
                    values[index+1] = matriz[i][lastIndex];
                    index += 2;
                    lastIndex--;
                }
            }
        }
        return values;
    }

    public static int[][] randomMatriz() {
        Random rand = new Random();
        int[][] matriz = new int[8][8];


        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = rand.nextInt(0, 100);
            }
        }

        return matriz;
    }

    public static void saveInFile(int[] vetor) {
        String fileDiretcory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista25\\ex5\\values.txt";
        File file = new File(fileDiretcory);
        String values = Arrays.toString(vetor);

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(values);
            System.out.println("Salvo com sucesso!");
            writer.close();
        } catch (Exception e) {
            System.out.println("Não foi possível salvar.");
        }
    }
}
