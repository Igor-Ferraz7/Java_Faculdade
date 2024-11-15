package Segundo_Periodo.exercicios_lista19;

import java.util.Arrays;
import java.util.Scanner;

public class Selecionar {
    static Scanner input = new Scanner(System.in);
    static boolean closure_requested = false;
    static boolean informed_length = false;
    static boolean is_finded = false;
    static int[] vector;
    static int length = 0;
    static int num_position = -1;

    public static void main(String [] args) {
        menu_process();
    }

    static void menu_process() {
        int option = main_menu();
        execut_main_menu(option);

        option = sort_menu();
        execut_sort_menu(option);

        option = search_menu();
        execut_search_menu(option);

    }

    static void execut_search_menu(int option) {
        switch (option){
            case 1:
                binary_search_option();
                break;
            case 2:
                linear_search_option();
                break;
        }

        find_position(is_finded, num_position);

    }

    static void execut_sort_menu(int option) {
        long start_time = 0;
        long end_time = 0;
        int[] sorted_vector;

        switch (option) {
            case 1 -> {
                start_time = System.nanoTime();
                vector = Arrays.copyOf(insertion_sort(vector), vector.length);
                end_time = System.nanoTime();
            }
            case 2 -> {
                start_time = System.nanoTime();
                vector = Arrays.copyOf(heap_sort(vector), vector.length);
                end_time = System.nanoTime();
            }
        }

        int time = (int) (end_time - start_time);

        System.out.printf("Demorou %d nanosegundos para ser executado.\n", time);


    }

    static void execut_main_menu(int option) {
        switch (option) {
            case 1:
                fill_option();
                break;
            case 2:
                System.exit(0);
                break;
        }
    }

    static int main_menu() {
        System.out.print(
                """
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                Menu Principal:
                1 - Preencher Vetor
                2 - Sair
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                """
        );
        System.out.print("Selecione sua opção: ");
        int option = input.nextInt();
        option = option_validation(option);

        return option;

    }

    static int fill_menu(){
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
        int option = input.nextInt();
        option = option_validation(option);

        return option;

    }

    static int sort_menu() {
        System.out.print(
                """
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                Menu Ordenar:
                1- Ordenação Método Inserção
                2- Ordenação Método Heap
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                """
        );
        System.out.print("Selecione sua opção: ");
        return input.nextInt();
    }

    static int search_menu() {
        System.out.print(
                """
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                Menu Buscar:
                1 - Busca Binária
                2 - Busca Linear
                -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                """
        );
        System.out.print("Selecione sua opção: ");
        int option = input.nextInt();
        option = option_validation(option);

        return option;
    }

    static int[] fill_vector(int length) {
        int[] vector = new int[length];

        for (int i = 0; i < length; i++) {
            System.out.printf("2- Preencher vetor [%d]: ", i);
            vector[i] = input.nextInt();
        }

        return vector;
    }

    static void fill_option(){
        int fill_choice = fill_menu();

        switch (fill_choice) {
            case 1:
                System.out.print("1- Informe tamanho do vetor: ");
                length = input.nextInt();
                informed_length =  true;
                fill_choice = 2;

            case 2:
                if (informed_length) {
                    vector = Arrays.copyOf(fill_vector(length), length); //preenche o vetor
                    informed_length = false;
                } else {
                    System.out.print("Erro! Informe o tamanho do vetor primeiramente: ");
                    length = input.nextInt() ;

                    vector = Arrays.copyOf(fill_vector(length), length); //preenche o vetor
                    informed_length = false;
                }
        }
    }

    static int[] heap_sort(int[] vetor) {
        int n = vetor.length;

        for(int i = n / 2 - 1; i >= 0; i--){
            aplicarHeap(vetor, n, i);
        }

        for(int j = n-1; j > 0; j--){
            int aux = vetor[0];
            vetor[0] = vetor[j];
            vetor[j] = aux;

            aplicarHeap(vetor, j, 0);
        }

        return vetor;
    }

    public static void aplicarHeap(int[] vetor, int n, int i){
        int raiz = i;
        int esquerda = 2*i + 1;
        int direita = 2*i + 2;

        if (esquerda < n && vetor[esquerda] > vetor[raiz]){
            raiz = esquerda;
        }
        if (direita < n && vetor[direita] > vetor[raiz]){
            raiz = direita;
        }

        if (raiz != i){
            int aux = vetor[i];
            vetor[i] = vetor[raiz];
            vetor[raiz] = aux;

            aplicarHeap(vetor, n, raiz);
        }

    }

    static int[] insertion_sort(int[] vetor) {
        int aux, j;

        for(int i = 1; i < vetor.length; i++){
            aux = vetor[i];
            j = i-1;
            while(j >= 0 && vetor[j] > aux){
                vetor[j+1] = vetor[j];
                j--;
            }
            vetor[j+1] = aux;
        }

        return vetor;

    }

    static void binary_search_option() {
        System.out.print("-> Informe o valor a ser pesquisado: ");
        int num = input.nextInt();
        int start = 0;
        int end = vector.length - 1;

        while (start <= end) {
            int middle = (start + end) / 2;

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
    }

    static void linear_search_option() {
        System.out.print("-> Informe o valor a ser pesquisado: ");
        int num = input.nextInt();

        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == num) {
                num_position = i;
                is_finded = true;
                break;
            }
        }
    }

    static void find_position(boolean conditional, int num_position) {
        if (conditional) {
            System.out.printf("""
                    -=-=-=-=-=-=-=-=-=-=-=-=-=-=-
                    O número foi encotrado na posição [%d].
                    """, num_position);
        } else {
            System.out.println("O número não foi encontrado.");
        }
    }

    static int option_validation(int option) {
        boolean is_valid = option == 1 || option == 2;

        while (!is_valid) {
            System.out.print("-> Opção inválida.\nPor favor escolha apenas entre 1 e 2: ");
            option = input.nextInt();
            is_valid = option == 1 || option == 2;
        }

        return option;
    }

}
