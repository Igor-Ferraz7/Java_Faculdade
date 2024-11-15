package Terceiro_Periodo.lista_ex14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static Scanner input = new Scanner(System.in);
    static int optionSelected = 0;
    static String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista24\\";

    public static void main(String[] args) {
        boolean decision = false;

        while (!decision) {
            menu();
            executeOption(optionSelected);
            decision = validationDecision();
        }
    }


    public static void menu() { //talvez tenha que ser sem static
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        System.out.println("[1] Verificar a exist�ncia de um arquivo");
        System.out.println("[2] Criar um arquivo");
        System.out.println("[3] Ler um arquivo");
        System.out.println("[4] Deletar um arquivo");
        System.out.println("[5] Alterar conte�do de um arquivo");

        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");

        optionSelected = validationOption();

    }


    public static void executeOption(int option) {
        System.out.print("Nome do arquivo: ");
        String fileName = input.next();

        switch (option) {
            case 1:
                CheckFile.checkExistence(fileName);
                break;
            case 2:
                CreateFile.create(fileName);
                break;
            case 3:
                ReadFile.readF(fileName, fileDirectory);
                break;
            case 4:
                DeleteFile.del(fileName);
                break;
            case 5:
                ChangeFileContent.change(fileName, fileDirectory);
                break;
        }
    }


    public static int validationOption() {
        int option = 0;
        boolean isValidOption = false;
        System.out.print("Escolha a fun��o que queira usar: ");

        try {
           option = input.nextInt();

           if (option < 1 || option > 5) {
               throw new InvalidOption("N�mero n�o est� entre 1 e 5.");
           }

           isValidOption = true;
        } catch (InputMismatchException ime) {
//            while (!isValidOption) { //acho q n precisa de um while
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("-> Valor inv�lido!");
            System.out.println(">>> Selecione um N�MERO INTEIRO de 1 a 5.");
            input.next();
            menu();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        } catch (InvalidOption io) {
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
            System.out.println("-> Valor inv�lido!");
            System.out.println(">>> Selecione um n�mero apenas no intervalo de 1 a 5.");
            menu();
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        }
        return option;
    }


    public static boolean validationDecision() {
        boolean decision = false;
        String quest = "";

        try {
            System.out.print("Deseja continuar [S]/[N]? ");
            quest = input.next().toLowerCase();

            if (quest.equals("n�o") || quest.equals("n") || quest.equals("nao")) {
                decision = true;
            } else if (quest.equals("sim") || quest.equals("s")) {}
            else {
                throw new InputMismatchException();
            }

        } catch (InputMismatchException ime) {
            System.out.println("Resposta inv�lida. Responda com sim ou n�o.");
            validationDecision();
        }

        return decision;

    }
}

