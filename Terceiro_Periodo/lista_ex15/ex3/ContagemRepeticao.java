package lista_ex15.ex3;

public class ContagemRepeticao {
    public static void main(String[] args) {
        ContagemRepeticao.count("tudo");
    }

    public static void count(String word) {
        String text = ReadFileL2.getText("msg.txt");
        String[] textSplited = text.toLowerCase().split(" ");
        int repeats = 0;

        for (int i = 0; i < textSplited.length; i++) {
            if (textSplited[i].contains(word)) {
                repeats++;
            }
        }

        System.out.printf("'%s' se repete: %d vez(es).\n", word, repeats);

    }
}
