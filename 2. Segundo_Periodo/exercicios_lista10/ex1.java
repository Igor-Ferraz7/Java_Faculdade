package exercicios_lista10;

/*
Faça um procedimento que recebe por parâmetro os valores necessário para o
cálculo da fórmula de báskara e retorna, também por parâmetro, as suas raízes,
caso seja possível calcular..
 */

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args){
        double[] raizes = new double[2];
        boolean eq = baskara(3, 0, 12, raizes);

        if (eq){
            System.out.println(Arrays.toString(raizes));
        } else {
            System.out.println(eq);
        }
    }

    static boolean baskara(double a, double b, double c, double[] raiz){
        double delta = b*b - (4 * a * c);

        if (delta < 0){
            return false;
        } else {
            raiz[0] = (-b + Math.sqrt(delta)) / (2*a);
            raiz[1] = (-b - Math.sqrt(delta)) / (2*a);

            return true;
        }

    }

}
