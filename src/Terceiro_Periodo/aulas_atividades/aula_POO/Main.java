package Terceiro_Periodo.aulas_atividades.aula_POO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        System.out.println(p1.get_name());

        p1.set_name("Igor");

        System.out.println(p1.get_name());
    }
}
