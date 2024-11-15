package lista_ex16.ex4;

/*
Criar em Java uma classe chamada AlterarLinha, que irá realizar a leitura de um arquivo de texto
chamado leitura.txt. O usuário deverá informar um número qualquer entre 1(primeira linha do
arquivo) e N(sendo o número máximo de linhas do arquivo) e exibir o conteúdo desta linha em
específico. Caso o usuário informe uma linha inválida deverá ser lançada a exceção
LinhaInvalidaExcpetion e encerrar o programa.
 */

import java.io.File;
import java.util.Scanner;

public class AlterarLinha {
    static String fileDirectory ="C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista26\\ex4\\leitura.txt";

    public static void main(String[] args) {
        findLines();
    }

    public static void findLines() {
        File file = new File(fileDirectory);
        Scanner input = new Scanner(System.in);


        try (Scanner scanFile = new Scanner(file)) {
            int countLines = 0;
            String line = "";

            System.out.print("Digite a linha que quer ler: ");
            int nLine = input.nextInt();

            while (scanFile.hasNextLine()) {

                if (countLines == nLine) {
                    line = scanFile.nextLine();
                } else {
                    scanFile.nextLine();
                }

                countLines++;
            }

            if (nLine > countLines) {
                System.out.println("Solicitado: " + nLine);
                System.out.println("Quantidade máxima: " + countLines);
                throw new LinhaInvalidaException("Máximo de linhas ultrapassado.");
            } else {
                System.out.println("Texto da linha: " + line);
            }

        } catch (LinhaInvalidaException lie) {
            System.out.println(lie.getMessage());
        } catch (Exception e) {
            System.out.println("Linha inválida.");
        }
    }

}
