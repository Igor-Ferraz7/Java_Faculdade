package Quarto_Periodo.lista_exercicio3;

import Quarto_Periodo.lista_exercicio1.ex2.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        List<Peixe> fishes = new ArrayList<Peixe>();
        List<Cachorro> dogs = new ArrayList<Cachorro>();

        Scanner input = new Scanner(System.in);


        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira o nome do %d� peixe: ", i+1);
            String name = input.next();

            System.out.printf("Insira o peso do %d� peixe: ", i+1);
            Double weight = input.nextDouble();

            System.out.printf("Insira o tipo de habitat do %d� peixe: ", i+1);
            String habitat = input.next();

            fishes.add(new Peixe(name, weight, habitat));
        }

        for (int i = 0; i < 5; i++) {
            System.out.printf("Insira o nome do %d� cachorro: ", i+1);
            String name = input.next();

            System.out.printf("Insira o peso do %d� cachorro: ", i+1);
            Double weight = input.nextDouble();

            System.out.printf("Insira a ra�a do %d� cachorro: ", i+1);
            String raca = input.next();

            dogs.add(new Cachorro(name, weight, raca));

        }
    }
}
