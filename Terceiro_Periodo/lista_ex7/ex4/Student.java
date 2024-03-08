package lista_ex7.ex4;

/*
Crie uma classe Aluno com atributos privados: nome, matrícula e notas(vetor com 3 índices).
Implemente métodos para calcular a média das notas e verificar se o aluno está aprovado ou
reprovado, considerando que a média é 7. Crie os métodos get e set para realizar a
manipulação dos atributos da classe. Após isso, crie uma classe chamada PrincipalAluno que
deverá ter três objetos do tipo Aluno. Informe valores para cada um desses objetos, mostre
suas informações na tela (nome, matrícula e cada uma das notas) e se foi aprovado ou
reprovado.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Student {
    private String name;
    private int matricule;
    private Double[] grades = new Double[3];

    public String getName() {
        return name;
    }

    public int getMatricule() {
        return matricule;
    }

    public String get_Grades() {
        return Arrays.toString(grades);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMatricule(int matricule) {
        this.matricule = matricule;
    }

    public void setGrades() {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < grades.length; i++) {
            System.out.printf("Nota %d: ", i+1);
            this.grades[i] = input.nextDouble();
            System.out.println();
        }
    }

    public void isAprove() {
        int sum = 0;

        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }

        if ((sum / 3) >= 7) {
            System.out.println("Aprovado :)");
        } else {
            System.out.println("Reprovado :(");
        }
    }
}
