package lista_ex16.ex2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Unificar {
    static String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista26\\ex2\\";


    public static void main(String[] args) {
        File fileText1 = new File(fileDirectory+"texto1.txt");
        File fileText2 = new File(fileDirectory+"texto2.txt");
        String text = groupText(fileText1, fileText2);
        saveInTxt(text);
        System.out.println(text);
    }


    public static void saveInTxt(String text) {
        File file = new File(fileDirectory+"concatenado.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(text);
        } catch (Exception e) {
            System.out.println("Não foi possível salver o texto unificado.");
        }

    }


    public static String groupText(File fileText1, File fileText2) {
        String text12 = "";
        try (Scanner fileScanner = new Scanner(fileText1)) {
            Scanner fileScanner2 = new Scanner(fileText2);

            while (fileScanner.hasNextLine()) {
                text12 += fileScanner.nextLine() + " " + fileScanner2.nextLine().toLowerCase() + "\n";
            }

        } catch (Exception e) {
            System.out.println("Não foi possível unificar os textos.");
        }

        return text12;
    }
}
