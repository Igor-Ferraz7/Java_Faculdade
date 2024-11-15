package lista_ex15.ex3;

import java.io.File;
import java.io.FileReader;

public class ReadFileL2 {

    public static void main(String[] args) {
        ReadFileL2.getText("mensagem.txt");
    }

    public static String getText(String fileName) {
        String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista25\\ex3\\";
        fileName = fileDirectory + fileName;
        File file = new File(fileName);
        String text = "";

        try (FileReader fileReader = new FileReader(file)){
            int charCode;

            while ((charCode = fileReader.read()) != -1) {
                char character = (char) charCode;
                text += character;
            }

        } catch (Exception e) {
            System.out.println("Falha ao ler o arquivo.");
            System.out.println(e.getMessage());
        }

        return text;
    }
}
