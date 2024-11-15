package Terceiro_Periodo.lista_ex13.ex5;/*
Crie uma classe chamada ConversorDeTemperatura que contenha um m�todo converterCelsiusParaFahrenheit
que aceita uma temperatura em graus Celsius como par�metro e retorna a temperatura equivalente
em graus Fahrenheit. Use throws para indicar que esse m�todo pode lan�ar uma exce��o
personalizada chamada TemperaturaInvalidaException se a temperatura em graus Celsius
for menor que -273.15 (zero absoluto). Use throw para lan�ar essa exce��o se a condi��o for atendida.
Escreva um programa principal que chama esse m�todo e lida com a exce��o.
A convers�o � dada pela f�rmula: F = (�C � 9/5) + 32.
 */

public class TemperatureConverter {
    public static void main(String[] args) {
        try{
            System.out.println(convertCelsiusToFahrenheit(-200));
        } catch (InvalidTemperatureException ite) {
            System.out.println(ite.getMessage());
        }
    }

    public static double convertCelsiusToFahrenheit(double tempCelsius) throws InvalidTemperatureException{
        double tempFahrenheit = 0;
        if (tempCelsius < -273.15) {
            throw new InvalidTemperatureException("Temperatura em Fahrenheit inv�lida");
        } else {
            tempFahrenheit = (tempCelsius * (9.0/5)) + 32;
        }

        return tempFahrenheit;
    }
}
