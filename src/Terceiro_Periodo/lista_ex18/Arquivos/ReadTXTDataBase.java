package Terceiro_Periodo.lista_ex18.Arquivos;/*
>> Criar uma lista de string para cada linha.
> Salvar dados de cada linha com o split para a lista de strings
 */

import java.io.File;
import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;

public class ReadTXTDataBase {
    private static File file = new File("C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista28\\Arquivos\\datebase.txt");
    protected static int qtdLine = 0;

    public static void main(String[] args) {
        textToVetor();
    }


    public static String[][] textToVetor() {
        String[][] studentsBD;

        try (Scanner scanFile = new Scanner(file)) {
            // Capturando a quantidade de linhas:
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
            lineNumberReader.skip(file.length());

            int index = 0;
            qtdLine = lineNumberReader.getLineNumber() + 1;
            studentsBD = new String[qtdLine][6];

            // Salvando cada linha no Vetor:
            while (scanFile.hasNextLine()){
                String tempText = scanFile.nextLine();
                String[] textSplited = tempText.split(",");

                for (int column = 0; column < 6; column++) {
                    studentsBD[index][column] = textSplited[column];
                }

                index++;
            }

            scanFile.close();
            lineNumberReader.close();

        } catch (Exception e) {
            studentsBD = new String[0][0];
            System.out.println(e.getMessage());
        }

        return studentsBD;

    }

    public static File getFile() {
        return file;
    }

    public static int getQtdLine() {
        try (Scanner scanFile = new Scanner(file)) {
            // Capturando a quantidade de linhas:
            LineNumberReader lineNumberReader = new LineNumberReader(new FileReader(file));
            lineNumberReader.skip(file.length());

            int index = 0;
            qtdLine = lineNumberReader.getLineNumber() + 1;
        } catch (Exception e) {
            System.out.println("getQtdLine >> Erro ao ler o arquivo.");
        }
        return qtdLine;
    }
}
