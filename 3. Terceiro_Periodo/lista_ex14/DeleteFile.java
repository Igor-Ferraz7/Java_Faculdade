package lista_ex14;

import java.io.File;

public class DeleteFile {

    public static void main(String[] args) {
        DeleteFile.del("mt.txt");
    }

    public static void del(String fileName) {
        String fileDirectory = "C:\\Users\\igors\\IdeaProjects\\Faculdade\\src\\exercicios_lista24\\";
        fileName = fileDirectory + fileName;
        File file = new File(fileName);

        if (file.delete()) {
            System.out.println("Deletado com sucesso!");
        } else {
            System.out.println("Erro ao deletar.");
        }
    }
}
