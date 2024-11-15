package Terceiro_Periodo.aulas_atividades.aula_POO;

public class Person {
    private String name;
    private int age;

    Person(){
        this.name = "Anônimo";
        this.age = 0;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public String get_name() {
        return name;
    }
}
