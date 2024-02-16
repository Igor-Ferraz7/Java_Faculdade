package lista_ex4;

/*
2) Criar um método recursivo que irá percorrer todo um vetor do tipo inteiro e exibir
seus valores na tela, em ordem crescente(exibir índice 0, depois índice 1, índice 2, …,
índice N, sendo N o tamanho do vetor).
 */

public class ex2 {
    public static void main(String[] args) {
        int[] vector = new int[]{1, 9, 4, 5, 1, 10};
        percorrerVetor(vector, 0);
    }

    public static void percorrerVetor(int[] vector, int position) {
        if (position < vector.length) {
            System.out.printf("Indice %d: %d\n", position, vector[position]);
            percorrerVetor(vector, position+1);
        }
    }
}
