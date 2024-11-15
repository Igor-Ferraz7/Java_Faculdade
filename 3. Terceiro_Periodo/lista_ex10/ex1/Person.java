package lista_ex10.ex1;

/*
Crie uma classe Pessoa com atributos privados: nome, idade e altura.
Adicione métodos para realizar a manipulação desses atributos (get e set).
Crie uma classe chamada PrincipalPessoa, e nesta classe crie pelo menos duas instâncias da classe Pessoa.
Defina valores para essas instâncias e mostre suas informações na tela.
 */

public class Person {
    private String name;
    private int age;
    private double hight;

/*    Person(String name, int age, double hight) {
        this.name = name;
        this.age = age;
        this.hight = hight;
    }*/

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHight() {
        return hight;
    }
    //-=-=-=-=-=-=-=--==-=--=-=-=-=-==-=--=-
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHight(double hight) {
        this.hight = hight;
    }


    public void showAtributes() {
        System.out.println(this.name);
        System.out.println(this.age);
        System.out.println(this.hight);
    }
}
