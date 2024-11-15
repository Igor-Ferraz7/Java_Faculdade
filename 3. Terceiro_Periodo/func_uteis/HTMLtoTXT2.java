package func_uteis;

import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class HTMLtoTXT2 {
    static Scanner input = new Scanner(System.in);
    static String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista25\\ex4\\";

    public static void main(String[] args) {
        readFile("index.html", fileDirectory);
    }

    public static void readFile(String fileName, String fileDirectory) {
        fileName = fileDirectory + fileName;
        File file = new File(fileName);
        System.out.println(fileName);

        try (FileReader fileReader = new FileReader(file)){
            int charCode;
            String text = "";
            boolean isTagOpen = false;
            boolean isTagClose = false;

            while ((charCode = fileReader.read()) != -1) { //salvando todo conteúdo numa String
                char character = (char) charCode;
                text += character;
            }

            //remove tags
            StringBuilder textCopy = new StringBuilder(text);
            int counter = 0;

            for (int letter = 0; letter < text.length(); letter++) {
                char charLetter = textCopy.charAt(counter);

                String charString = convertCharToString(charLetter);

                if (charLetter == '<') { //começando a remoção de uma tag
                    isTagOpen = true;
                    textCopy.deleteCharAt(counter);

                } else if (charLetter == '>') { //fechando a remoção de uma tag
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


        } catch (Exception e) {
            System.out.println("Falha ao ler o arquivo.");
            System.out.println(e.getMessage());
        }
    }

    public static String convertCharToString(char character) {
        String charString = "";
        charString += character;

        return charString;

    }

}
