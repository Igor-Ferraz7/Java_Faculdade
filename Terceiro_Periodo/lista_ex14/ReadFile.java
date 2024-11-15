package lista_ex14;

import java.io.File;
import java.io.FileReader;

public class ReadFile {

    public static void main(String[] args) {
        String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista24\\";
        System.out.println("Main sendo excecutado.");
        ReadFile.readF("mytext.txt", fileDirectory);
    }

    public static void readF(String fileName, String fileDirectory) {
        fileName = fileDirectory + fileName;
        File file = new File(fileName);
        System.out.println(fileName);

        try (FileReader fileReader = new FileReader(file)){
            int charCode;

            System.out.println("----------------------------------------");
            System.out.println(">> Conteúdo do arquivo:");

            while ((charCode = fileReader.read()) != -1) {
                char character = (char) charCode;
                System.out.print(character);
            }

            System.out.println("\n----------------------------------------");
        } catch (Exception e) {
            System.out.println("Falha ao ler o arquivo.");
            System.out.println(e.getMessage());
        }

    }
}
