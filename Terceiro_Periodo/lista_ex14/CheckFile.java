package lista_ex14;

import java.io.File;

public class CheckFile {

    public static void main(String[] args) {
        CheckFile.checkExistence("mytext.txt");
    }

    public static void checkExistence(String fileName) {
        String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista24\\";
        fileName = fileDirectory + fileName;
        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("O arquivo não existe.");
        } else {
            System.out.println("O arquivo existe!");
        }
    }
}
