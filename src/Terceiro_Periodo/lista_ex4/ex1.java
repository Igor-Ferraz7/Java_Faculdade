package Terceiro_Periodo.lista_ex4;/*
1) Criar um método chamado contagemRecursiva , que recebe como parâmetro um valor do
tipo inteiro. Esse método deverá exibir a contagem de 0 até o valor informado.
Exemplo:
Valor informado: 9
Resultado esperado:
0 1 2 3 4 5 6 7 8 9

 */

public class ex1 {
    public static void main(String[] args) {
        contagemRecursiva(10);
    }

    public static void contagemRecursiva(int limit) {
        if (limit >= 0) {
            contagemRecursiva(limit - 1);
            System.out.printf("%d ", limit);
        }
    }
}
