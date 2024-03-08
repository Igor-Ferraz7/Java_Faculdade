package lista_ex7.ex1;

/*
Crie uma classe Pessoa com atributos privados: nome, idade e altura. Adicione métodos para
realizar a manipulação desses atributos (get e set).
 */

class Person{
    private String name;
    private int age;
    private Double hight;

    public String getName() {
        return name;
    }

    public int get_Age() {
        return age;
    }

    public Double get_Hight() {
        return hight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHight(Double hight) {
        this.hight = hight;
    }
}