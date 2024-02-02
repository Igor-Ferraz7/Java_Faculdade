package exercicios_lista17;

/*
Crie uma classe Java chamada ClasseBuscar que apresenta a seguinte opção para o usuário:
 Metodo para isso, retornar valor inserido.
 Método para verificação se é viável a seleção do próximo método ou se requer outra execução primeiro.
Menu Principal
1- Preencher Vetor
2- Busca Sequencial
3- Busca Binária
4- Exibir Vetor
0- Sair

Após o usuário informar a opção 1 - Preencher vetor, deve-se apresentar a seguinte tela:

Menu Preencher
1- Informar tamanho do vetor
2- Preencher vetor

Ao escolher a opção “1 - Preencher Vetor” o usuario deverá obrigatoriamente preencher os dois
campos acima, onde ele irá informar o tamanho do vetor a ser criado e somente apos isso, preencher
esse vetor com numeros aleatorios. Caso o usuario tente preencher o vetor ANTES de informar o
tamanho, deverá ser mostrado na tela uma mensagem de erro e peça ao usuario para que
primeiramente informe o tamanho do vetor.
Ao preencher o vetor, deve-se voltar para o menu inicial.

Se o usuário informar a opção 2 ou opção 3, deverá ser mostrado o seguinte menu:

Menu Buscar
-> Informe o valor a ser pesquisado:

Se o usuário escolher a opção 2 ou opção 3, deve-se retornar a posição do número no vetor e exibir a
quantidade de comparações realizadas para encontrar o valor. Caso não seja encontrado nenhum
valor, retornar o valor -1 e informar ao usuário que o valor não existe no vetor.
Antes de realizar qualquer busca (sequencial ou binária) o vetor deve obrigatoriamente estar
ordenado (utilize um dos métodos de ordenação: bubble, insertion ou selection).
 */

import java.util.Arrays;
import java.util.Scanner;

public class ClasseBuscar {
    static Scanner input = new Scanner(System.in);
    static boolean closure_requested = false;
    static boolean informed_length = false;
    static int[] vector;
    static int length = 0;

    public static void main(String[] args) {

        System.out.println();
        while (!closure_requested) {
            int choice = main_menu();
            conditional_verification(choice);
        }
    }

    static int main_menu() {
        int choice = 0;

        System.out.print(
                """
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                Menu Principal:
                1- Preencher Vetor
                2- Busca Sequencial
                3- Busca Binária
                4- Exibir Vetor
                0- Sair
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                """
        );
        System.out.print("Selecione sua opção: ");
        choice = input.nextInt();

        return choice;

    }

    static void conditional_verification(int choice){
        switch (choice) {
            case 0:
                closure_requested = true;
                break;
            case 1:
                fill_option();
                break;
            case 2:
                lienar_search_option();
                break;
            case 3:
                binary_search_option();
                break;
            case 4:
                System.out.println(Arrays.toString(vector));
                break;
        }
    }

    static void binary_search_option() {
        System.out.print("-> Informe o valor a ser pesquisado: ");
        int num = input.nextInt();
        int num_position = -1;
        int  comparisons = 0;
        int start = 0;
        int end = vector.length - 1;
        boolean is_finded = false;


        selection_sort();

        long start_time = System.nanoTime();

        while (start <= end) {
            int middle = (start + end) / 2;
            comparisons++;

            if (vector[middle] == num) {
                is_finded = true;
                num_position = middle;
                break;
            }
            if (vector[middle] < num) {
                start = middle + 1;
            } else {
                end = middle - 1;
            }
        }

        find_position(is_finded, num_position, comparisons);

    }

    static void lienar_search_option() {
        System.out.print("-> Informe o valor a ser pesquisado: ");
        int num = input.nextInt();
        int num_position = -1;
        int  comparisons = 0;
        boolean is_finded = false;

        selection_sort();

        for (int i = 0; i < length; i++) {
            comparisons++;
            if (num == vector[i]) {
                num_position = i;
                is_finded = true;
                break;
            }
        }

        find_position(is_finded, num_position, comparisons);

    }

    static void fill_option(){
        int fill_choice = fill_menu();

        switch (fill_choice) {
            case 1:
                System.out.print("1- Informe tamanho do vetor: ");
                length = input.nextInt();
                informed_length =  true;
                break;

            case 2:
                if (informed_length) {
                    informed_length = false;
                    vector = Arrays.copyOf(fill_vector(length), length);
                } else {
                    System.out.print("Erro! Informe o tamanho do vetor primeiramente: ");
                    length = input.nextInt() ;
                    informed_length = false;
                    vector = Arrays.copyOf(fill_vector(length), length);
                }
        }


    }

    static int fill_menu(){
        int fill_choice = 0;
        System.out.print(
                """
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                Menu Preencher:
                1- Informar tamanho do vetor
                2- Preencher vetor
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                """
        );
        System.out.print("Selecione sua opção: ");
        fill_choice = input.nextInt();

        return fill_choice;

    }

    static int[] fill_vector(int length) {
        int[] vector = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.printf("2- Preencher vetor [%d]: ", i);
            vector[i] = input.nextInt();
        }

        return vector;
    }

    static boolean is_vector_empty() {
        boolean is_empty = false;
        if (vector == null) {
            System.out.println("É necessário preencher o vetor primeiro.");
            is_empty = true;
        }
        return is_empty;
    }

    static void selection_sort(){
        int aux;
        int min;

        for (int i = 0; i < vector.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < vector.length; j++) {
                if (vector[j] < vector[min]) {
                    min = j;
                }
            }

            aux = vector[min];
            vector[min] = vector[i];
            vector[i] = aux;

        }
    }

    static void find_position(boolean conditional, int num_position, int comparisons) {
        if (conditional) {
            System.out.printf("""
                    -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                    O número foi encotrado na posição [%d].
                    Foi necessário fazer %d comparações.
                    """, num_position, comparisons);
        } else {
            System.out.printf("""
                    O número não foi encontrado.
                    Foi realizado %d comparações.
                    """, comparisons);
        }
    }

    // Sugestão: Criar metodo para lidar com vetores vazios :)

}
