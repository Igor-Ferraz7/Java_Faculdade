package lista_ex13.ex1;

import vini_aula2.aula_exception.ValorNegativoErro;

public class Main {
    public static void main(String[] args) throws Exception {
        Person p1 = null;

        try {
            if (p1 ==  null) {
                throw new ErroValorNull("Objeto vazio.");
            }

            int age = 2023 - p1.getAnoNasc();
            System.out.println("Name: " + p1.getName());
            System.out.println("Age: " + age);

        } catch (ErroValorNull evn) {
            System.out.println("Erro! " + evn.getMessage());
        }
    }
}
