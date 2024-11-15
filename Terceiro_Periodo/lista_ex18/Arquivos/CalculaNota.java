package lista_ex18.Arquivos;

// nome, matrícula, série, nota 1, nota 2 e nota 3.
//  0        1        2      3       4        5

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;


public class CalculaNota extends ReadTXTDataBase {
    private static String[][] averageOfStudents;

    public static void main(String[] args) {
        averages();
        writeAverages();
    }


    public static String[][] averages() {
        String[][] studentsBD = textToVetor();
        averageOfStudents = new String[qtdLine][3];

        for (int i = 1; i < qtdLine; i++) {
            double n1 = Double.parseDouble(studentsBD[i][3]);
            double n2 = Double.parseDouble(studentsBD[i][4]);
            double n3 = Double.parseDouble(studentsBD[i][5]);

            double sum = n1 + n2 + n3;
            double average = sum / 3;

            averageOfStudents[i][0] = studentsBD[i][0];
            averageOfStudents[i][1] = studentsBD[i][2];
            averageOfStudents[i][2] = String.valueOf(average);
        }

        return averageOfStudents;
    }

    public static void writeAverages() {
        File file = new File("C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista28\\Arquivos\\media_2024.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {
            BufferedWriter writer = new BufferedWriter(fileWriter);
            String averagesString = "Nome, Serie, Média\n";

            for (int i = 1; i < qtdLine; i++) {

                if (i % 200 == 0) {
                    writer.flush();
                }

                String name = averageOfStudents[i][0] + ", ";
                String serie = averageOfStudents[i][1] + ", ";
                String average = averageOfStudents[i][2] + "\n";

                averagesString += name + serie + average;
            }

            writer.write(averagesString);
            writer.close();

        } catch (Exception e) {
            System.out.println("Não foi possível escrever.");
        }
    }

    public static String[][] getAverageOfStudents() {
        return averageOfStudents;
    }
}
