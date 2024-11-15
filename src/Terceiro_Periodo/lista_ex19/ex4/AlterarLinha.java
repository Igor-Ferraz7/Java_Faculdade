package Terceiro_Periodo.lista_ex19.ex4;/*
Criar em Java uma classe chamada AlterarLinha, que ir� realizar a leitura de um arquivo de texto
chamado leitura.txt. O usu�rio dever� informar um n�mero qualquer entre 1(primeira linha do
arquivo) e N(sendo o n�mero m�ximo de linhas do arquivo) e exibir o conte�do desta linha em
espec�fico. Caso o usu�rio informe uma linha inv�lida dever� ser lan�ada a exce��o
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
                System.out.println("Quantidade m�xima: " + countLines);
                throw new LinhaInvalidaException("M�ximo de linhas ultrapassado.");
            } else {
                System.out.println("Texto da linha: " + line);
            }

        } catch (LinhaInvalidaException lie) {
            System.out.println(lie.getMessage());
        } catch (Exception e) {
            System.out.println("Linha inv�lida.");
        }
    }

}
