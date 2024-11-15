package Terceiro_Periodo.lista_ex16.ex3;/*
Crie em Java uma classe chamada Ordenar, que dever� ler o conte�do do arquivo numeros.txt e
orden�-los em ordem DECRESCENTE. Ap�s realizar a ordena��o, substitua o conte�do original do
arquivo pelos n�meros ordenados. Exemplo:
Original: 7,8,3,0,1,2,4,5,9,6
Ordenado: 9,8,7,6,5,4,3,2,1,0
 */

import java.io.*;
import java.util.Arrays;

public class Ordernar {
    static String fileDirectory =  "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista26\\ex3\\numeros.txt";
    public static void main(String[] args) {
        int[] n1 = turnTxtInVetor();
        n1 = sortNumText(n1);
        saveNumbers(n1);
    }

    public static void saveNumbers(int[] numbersVetor) {
        String numbers = "";
        File file = new File(fileDirectory);

        for (int i = 0; i < numbersVetor.length; i++) {
            if (i != numbersVetor.length - 1) {
                numbers += numbersVetor[i] + ",";
            } else {
                numbers += numbersVetor[i];
            }
        }
        System.out.println(numbers);

        try (FileWriter fileWriter = new FileWriter(file)) {
            BufferedWriter writer = new BufferedWriter(fileWriter);
            writer.write(numbers);
            writer.newLine();
            writer.close();

        } catch (Exception e) {
            System.out.println("Erro ao salvar");
        }

    }

    public static int[] sortNumText(int[] numbers) {
        Arrays.sort(numbers);
        int[] copyNumbers = new int[numbers.length];
        int counter = 0;

        for (int i = numbers.length-1; i >= 0; i--) {
            copyNumbers[i] = numbers[counter];
            counter++;
        }

        return copyNumbers;

    }

    public static int[] turnTxtInVetor() {
        File file = new File(fileDirectory);
        int[] vetor = new int[0];


        try (FileReader fileReader = new FileReader(file)){
            int charCode;
            StringBuilder numbers = new StringBuilder();

            while ((charCode = fileReader.read()) != -1) {
                char character = (char) charCode;

                if (character != ',' && character != '\r' && character != '\n') {
                    numbers.append(character); //o erro est� aqui! "numbers" esta recebendo muitos 1
                } else {
                    char cc = character;
                }
            }

            System.out.println(numbers);
            vetor = new int[numbers.length()];

            for (int i = 0 ; i < vetor.length; i++) {
                vetor[i] = Character.getNumericValue(numbers.charAt(i));
            }

        } catch (Exception e) {
            System.out.println("Erro.");
        }
        
        return vetor;

    }

}
