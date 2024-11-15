package lista_ex14;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class ChangeFileContent {
    static String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista24\\";

    public static void main(String[] args) {
        change("mytext.txt", fileDirectory);
    }

    public static void change(String fileName, String fileDirectory) {
        Scanner input = new Scanner(System.in);
        fileName = fileDirectory + fileName;
        File file = new File(fileName);

        System.out.print("Digite o conteúdo a ser inserido: ");
        String content = input.nextLine();

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(content);
            writer.newLine();
            writer.close();
            System.out.println("Conteúdo alterado com sucesso!");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}