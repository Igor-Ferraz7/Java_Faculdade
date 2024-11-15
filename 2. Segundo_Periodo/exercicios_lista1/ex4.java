package exercicios_lista1;

/*
 * Criar um vetor A com 10 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho, 
 * sendo que cada elemento do vetor B deverá ser o quadrado do respectivo elemento de A, 
 * ou seja: B[i] = A[i]^2.
 */

public class ex4 {
	public static void main(String[] args) {
		double vetorA[] = new double[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		double vetorB[] = new double[vetorA.length];
		
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = Math.pow(vetorA[i], 2);
			System.out.printf("%.0f, ", vetorB[i]);
		}
	}
}
