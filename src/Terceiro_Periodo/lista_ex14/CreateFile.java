package Terceiro_Periodo.lista_ex14;

import java.io.File;

public class CreateFile {

//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Digite o nome do arquivo: ");
//        String fileName = input.nextLine();
//
//        CreateFile.create(fileName);
//
//    }

    public static void create(String fileName) {
        fileName = turnFileNameTxt(fileName);
        String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista24\\";
        fileDirectory += fileName;
        File filePath = new File(fileDirectory);

        if (!filePath.exists()) {
            System.out.println("Arquivo sendo criado...");

            try{
                filePath.createNewFile();
                System.out.println("Arquivo criado com sucesso!");
            }
            catch (Exception e){
                System.out.println("Falha ao criar o arquivo:");
                System.out.println(e.getMessage());
            }
        } else {
            System.out.println("O arquivo j� foi criado!");
        }
    }

    public static String turnFileNameTxt(String fileName) {
        if (!fileName.contains(".txt")) {
            fileName += ".txt";
        }
        return fileName;
    }

}
