package lista_ex5;

/*
Criar uma função recursiva que calcule o n-ésimo número da sequência de Fibonacci.
        // 0  1  1  2  3  5
        // 1  2  3  4  5  6 <- n
 */

public class ex4 {
    public static void main(String[] args) {
        System.out.println(NumberFibonacci(6));
    }

    public static int NumberFibonacci(int n){
        if (n == 1) {
            return 0;
        } else if (n <= 3 && n >= 1) {
            return 1;
        } else if (n >= 4)  {
            return NumberFibonacci(n-1) + NumberFibonacci(n-2);
        }
        return -n;
        /*
           n=1    NumberFibonacci(0) -> 0  +  1 <- NumberFibonacci(-1) | 0  +  1 = 1
           n=2    NumberFibonacci(1) -> 1  +  0 <- NumberFibonacci(0)  | 1  +  0 = 1
           n=3    NumberFibonacci(2) -> 1  +  1 <- NumberFibonacci(2)  | 1  +  1 = 2
           n=4    NumberFibonacci(3) -> 2  +  1 <- NumberFibonacci(4)  | 2  +  1 = 3
           n=5    NumberFibonacci(4) -> 3  +  2 <- NumberFibonacci(6)  | 3  +  2 = 5
                                         [...]
        */
    }
}
