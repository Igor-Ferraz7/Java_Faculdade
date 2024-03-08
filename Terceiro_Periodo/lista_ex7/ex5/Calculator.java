package lista_ex7.ex5;

/*
Crie uma classe Calculadora com atributos privados valor1(inteiro) e valor2(inteiro) e
métodos para realizar operações básicas como soma, subtração, multiplicação e divisão.
Adicione um construtor nesta classe que receba dois valores inteiros. Crie uma classe chamada
PrincipalCalculadora que tenha um objeto do tipo Calculadora. Utilize os métodos somar,
subtração, multiplicação e divisão com os valores informados no construtor e mostre na tela o
resultado de cada um dos calculos. Obs.: Não será necessário criar os métodos get e set.
 */

public class Calculator {
    private int value1;
    private int value2;

    public Calculator(int value1, int value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public void sum() {
        System.out.println("Soma: " + (value1+value2));
    }
    public void sub() {
        System.out.println("Subtração: " + (value1-value2));
    }
    public void div() {
        System.out.println("Divisão: " + value1/value2);
    }
}
