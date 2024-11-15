package Terceiro_Periodo.lista_ex7.ex1;/*
 Crie uma classe chamada PrincipalPessoa,
e nesta classe crie pelo menos duas instâncias da classe Pessoa. Defina valores para essas
instâncias e mostre suas informações na tela.
 */

public class MainPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();

        p1.setName("Igor");
        p2.setName("Gabriel");

        p1.setAge(19);
        p2.setAge(20);

        p1.setHight(1.75);
        p2.setHight(1.79);

        System.out.println(p1.getName());
        System.out.println(p2.getName());

        System.out.println(p1.get_Age());
        System.out.println(p2.get_Age());

        System.out.println(p1.get_Hight());
        System.out.println(p2.get_Hight());
    }
}
