package Segundo_Periodo.exercicios_lista10;/*
Faça um procedimento que recebe a idade de um nadador por parâmetro e retorna ,
também por parâmetro, a categoria desse nadador de acordo com a tabela abaixo
 */

public class ex2 {
    public static void main(String[] args){
        System.out.println(category(20));
    }

    static String category(int age){
        if (age >= 5 && age <= 7){
            return "Infantil A";
        } else if (age >= 8 && age <= 10){
            return "Infantil B";
        } else if (age >= 11 && age <= 13){
            return "Juvenil A";
        } else if (age >= 14 && age <= 17){
            return "Juvenil B";
        } else if (age >= 18){
            return "Adulto";
        } else {
            return "Idade não aceita";
        }
    }

}
