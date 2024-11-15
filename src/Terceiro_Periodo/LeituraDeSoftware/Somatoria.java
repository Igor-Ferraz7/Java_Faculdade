package Terceiro_Periodo.LeituraDeSoftware;

public class Somatoria {
    public static void main(String[] args) {
        int soma;

        soma = soma_dois_numeros(3, 7);
        exibir_soma('a', 'b', soma);

        soma = soma_dois_numeros(1372, 2816);
        exibir_soma('x', 'y', soma);

        soma = soma_dois_numeros(271, 865);
        exibir_soma('w', 'z', soma);

    }

    static int soma_dois_numeros(int a, int b) {
        System.out.printf("Somando %d e %d.\n", a, b);

        return a + b;
    }

    static void exibir_soma(char arg1, char arg2, int soma) {
        System.out.printf("resultado da soma %s e %s: %d\n\n", arg1, arg2, soma);
    }

}