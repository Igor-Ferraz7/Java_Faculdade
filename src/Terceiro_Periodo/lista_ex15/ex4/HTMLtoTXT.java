package Terceiro_Periodo.lista_ex15.ex4;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class HTMLtoTXT {
    static String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista25\\ex4\\";

    public static void main(String[] args) {
        htmlToTxt("index.html", fileDirectory);
    }

    public static void htmlToTxt(String fileName, String fileDirectory) {
        String text = htmlToString(fileName, fileDirectory);
        text = removeTags(text);

        String filePath = fileDirectory + "index.txt";
        stringToTxt(filePath, text);
    }

    public static String htmlToString(String fileName, String fileDirectory) {
        fileName = fileDirectory + fileName;
        File file = new File(fileName);
        System.out.println(fileName);
        String text = "";

        try (FileReader fileReader = new FileReader(file)){
            int charCode;

            while ((charCode = fileReader.read()) != -1) { //salvando todo conte�do numa String
                char character = (char) charCode;
                text += character;
            }

        } catch (Exception e) {
            System.out.println("Falha ao ler o arquivo.");
            System.out.println(e.getMessage());
        }

        return text;
    }

    private static String removeTags(String text) {
        boolean isTagOpen = false;
        boolean isTagClose = false;
        StringBuilder textCopy = new StringBuilder(text);
        int counter = 0;

        for (int letter = 0; letter < text.length(); letter++) {
            char charLetter = textCopy.charAt(counter);

            if (charLetter == '<') { //come�ando a remo��o de uma tag
                isTagOpen = true;
                textCopy.deleteCharAt(counter);

            } else if (charLetter == '>') { //fechando a remo��o de uma tag
                isTagClose = true;
                textCopy.deleteCharAt(counter);

            } else if (isTagOpen && !isTagClose) { //tratando de um carater dentro de uma tag
                textCopy.deleteCharAt(counter);

            } else if (isTagOpen && isTagClose) { //
                isTagOpen = false;
                isTagClose = false;
                counter++;
            } else {
                counter++;
            }
        }

        text = textCopy.toString();
        text = text.replace("         ", "");
        System.out.println(text);
        return text;
    }

    public static void stringToTxt(String filePath, String text) {
        File file = new File(filePath);

        //criando o arquivo caso n�o exista
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter writer = new BufferedWriter(fileWriter);
            //txt.nextline().lenght()
            writer.write(text);
            writer.newLine();
            writer.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}