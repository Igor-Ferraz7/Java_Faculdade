package Terceiro_Periodo.lista_ex10.ex2;

import java.util.Scanner;

public class MainBook{
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Book[] vetorBook = new Book[2];

            for (int i = 0; i < vetorBook.length; i++) {
                vetorBook[i] = new Book();

                System.out.print("Insira o titulo: ");
                String title = input.next();

                vetorBook[i].setTitle(title);

                System.out.print("Insira o autor: ");
                String author = input.next();
                vetorBook[i].setAuthor(author);

                System.out.print("Insira a quantidade de paginas: ");
                int pagNumbers = input.nextInt();
                vetorBook[i].setPagNumbers(pagNumbers);

                vetorBook[i].showBookData();

            }
        }
}
