package Terceiro_Periodo.lista_ex19.ex1;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/*
Criar em Java uma classe chamada Contagem, que dever� ler o conte�do do arquivo de texto
linhas.txt e mostrar na tela a quantidade de linhas que este arquivo cont�m.
 */
//.nextLine().length();
public class Contagem {
    public static void main(String[] args) {
        count();
    }

    public static void count() {
        Scanner input = new Scanner(System.in);
        String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista26\\ex1\\linhas.txt";
        File file = new File(fileDirectory);

        try (Scanner fileScanner = new Scanner(file)){
            int countLines = 0;

            while (fileScanner.hasNextLine()) { // enquanto existir pr�xima linha:
                fileScanner.nextLine(); // avna�e para a pr�xima linha:
                countLines++;
            }

            System.out.println(countLines);

        } catch (Exception e) {
            System.out.println();
        }

    }
}
