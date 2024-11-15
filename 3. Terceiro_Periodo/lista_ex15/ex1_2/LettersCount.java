package lista_ex15.ex1_2;

import java.io.File;
import java.io.FileReader;

public class LettersCount {
    public static String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista25\\ex1\\";

    public static void main(String[] args) {
        LettersCount.contarConsoantes("mensagem.txt");
    }

    public static void countVogals(String fileName) {
        fileName = fileDirectory + fileName;
        File file = new File(fileName);


        try (FileReader fileReader = new FileReader(file)){
            int charCode;
            int vogalQtd = 0;

            while ((charCode = fileReader.read()) != -1) {
                char character = (char) charCode;
                switch (character) {
                    case 'a', 'e', 'i', 'o', 'u':
                        vogalQtd +=1;
                        break;
                    case 'A', 'E', 'I', 'O', 'U':
                        vogalQtd +=1;
                        break;
                }
            }

            System.out.println("----------------------------------------");
            System.out.println("Quantidade de vogais: " + vogalQtd);
            System.out.println("----------------------------------------");
        } catch (Exception e) {
            System.out.println("Falha ao ler o arquivo.");
            System.out.println(e.getMessage());
        }

    }

    public static void contarConsoantes(String fileName) {
        fileName = fileDirectory + fileName;
        File file = new File(fileName);

        try (FileReader fileReader = new FileReader(file)){
            int charCode;
            int consoantQtd = 0;
            String text = ReadFileL.getText("mensagem.txt");

            for (int letter = 0; letter < text.length(); letter++){
                char letterText = text.toLowerCase().charAt(letter);

                switch (letterText) {
                    case 'a', 'e', 'i', 'o', 'u', ' ':
                        break;
                    case '1', '2', '3', '4', '5', '6', '7', '8', '9', '0':
                        break;
                    default:
                        System.out.println(letterText);
                        consoantQtd += 1;
                }
            }

            System.out.println("----------------------------------------");
            System.out.println("Quantidade de consoantes: " + consoantQtd);
            System.out.println("----------------------------------------");

        } catch (Exception e) {
            System.out.println("Falha ao ler o arquivo.");
            System.out.println(e.getMessage());
        }
    }
}
