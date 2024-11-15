package lista_ex18.Arquivos;

/*
Após isso, crie uma nova classe chamada ExibirSerie onde o
usuário deverá informar o número da série(entre 1 e 5) e exibir o nome e a média de todos
os alunos dessa série informada.
 */

public class ExibirSerie extends CalculaNota{
    public static void main(String[] args) {
        printSeries(5);
    }

    public static void printSeries(int serie) {
        String[][] averageStudents = averages();

        System.out.println("Nome, Media");
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        for (int i = 1; i < qtdLine; i++) {
            if (averageStudents[i][1].equals(String.valueOf(serie))) {
                String nome = averageStudents[i][0] + ", ";
                String media = averageStudents[i][2] + "\n";

                String studentToPrint = nome + media;
                System.out.print(studentToPrint);
            }
        }

    }

}
