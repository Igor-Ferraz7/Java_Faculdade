package aulas_atividades;

public class aula_recursividade {
    public static void main(String[] args) {
        int[] vector = new int[]{1, 2, 3, 7, 1, 4};

        percorrerVetor(vector, 0);

    }

    public static void percorrerVetor(int[] vector, int position) {
        if (position == vector.length) {
            System.out.println();
        } else {
            System.out.println(vector[position]);
            percorrerVetor(vector, position + 1);
        }
    }

}