package lista_ex4;

/*
3) Criar um método recursivo que irá percorrer todo um vetor do tipo inteiro e exibir
seus valores na tela, em ordem decrescente(exibir índice N-1, depois índice N-2,
índice N-3, …, índice 0, sendo N o tamanho do vetor).

 */

public class ex3 {
    public static void main(String[] args) {
        int[] vector = new int[]{1, 2, 3, 4, 5, 6};
        percorrerVetorDecrescente(vector, 0);

    }

    public static void percorrerVetorDecrescente(int[] vector, int position) {
        if (position < vector.length) {
            percorrerVetorDecrescente(vector, position+1);
            System.out.printf("Indice %d: %d\n", position, vector[position]);
        }
    }
}
