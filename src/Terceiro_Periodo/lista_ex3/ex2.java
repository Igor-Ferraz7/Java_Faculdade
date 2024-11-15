package Terceiro_Periodo.lista_ex3;/*
2) Crie um método chamado calcularFibonacci que aceita um número inteiro n como parâmetro e
retorna o n-ésimo termo da sequência de Fibonacci. A sequência de Fibonacci começa com 0 e 1,
e cada termo subsequente é a soma dos dois termos anteriores (0, 1, 1, 2, 3, 5, 8, ...).
Chame esse método e informe para que o usuário informe o n-ésimo termo da sequência
de Fibonacci e exiba o resultado.
 */

public class ex2 {
    public static void main(String[] args) {
        System.out.println(calcularFibonacci(7));
    }

    public static int calcularFibonacci(int num) {
        int last_term = 0;
        int actual_term = 1;
        int aux;

        if (num == 1) { // Tratando a exceção to primeiro termo.
            actual_term = 0;
        } else { // Tratando do terceiro termo em diante (se for segundo termo o for é pulado).
            for (int i = 2; i < num; i++) {
                aux = actual_term;
                actual_term += last_term;
                last_term = aux;
            }
        }

        return actual_term;
    }
}
