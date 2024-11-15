package Terceiro_Periodo.lista_ex10.ex1;

import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Person[] personVetor = new Person[2];

        for (int i = 0; i < personVetor.length; i++) {
            personVetor[i] = new Person();

            System.out.print("Insira o nome: ");
            String name = input.next();

            personVetor[i].setName(name);

            System.out.print("Insira a idade: ");
            int age = input.nextInt();
            personVetor[i].setAge(age);

            System.out.print("Insira a altura: ");
            double hight = input.nextDouble();
            personVetor[i].setHight(hight);


            personVetor[i].showAtributes();

        }

    }

}
