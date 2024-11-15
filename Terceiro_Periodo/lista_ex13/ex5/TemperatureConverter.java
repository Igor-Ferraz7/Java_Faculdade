package lista_ex13.ex5;

/*
Crie uma classe chamada ConversorDeTemperatura que contenha um método converterCelsiusParaFahrenheit
que aceita uma temperatura em graus Celsius como parâmetro e retorna a temperatura equivalente
em graus Fahrenheit. Use throws para indicar que esse método pode lançar uma exceção
personalizada chamada TemperaturaInvalidaException se a temperatura em graus Celsius
for menor que -273.15 (zero absoluto). Use throw para lançar essa exceção se a condição for atendida.
Escreva um programa principal que chama esse método e lida com a exceção.
A conversão é dada pela fórmula: F = (°C × 9/5) + 32.
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
            throw new InvalidTemperatureException("Temperatura em Fahrenheit inválida");
        } else {
            tempFahrenheit = (tempCelsius * (9.0/5)) + 32;
        }

        return tempFahrenheit;
    }
}
