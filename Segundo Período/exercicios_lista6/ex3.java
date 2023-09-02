package exercicios_lista6;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

/*
 * 3) Leia uma matriz 5 x 10 que se refere respostas de 10 questões de múltipla escolha,
 * referentes a 5 alunos. Leia também um vetor de 10 posições contendo o gabarito
 * de respostas que podem ser a, b, c ou d. Seu programa deverá comparar as
 * respostas de cada candidato com o gabarito e emitir um vetor denominado resultado,
 * contendo a pontuação correspondente a cada aluno
 */

public class ex3 {
	public static void main(String[] args) {
		Random rand = new Random();
		Scanner input = new Scanner(System.in);
		char answer_sheet[] = new char[10];
		char student_test[][] = new char[5][10];
		char alternatives[] = new char[]{'a', 'b', 'c', 'd'};
		int rand_index = 0;
		
		for (int  i = 0; i < answer_sheet.length; i++) {
			rand_index = rand.nextInt(alternatives.length);
			answer_sheet[i] = alternatives[rand_index];
		}
		
		System.out.println(Arrays.toString(answer_sheet));
		
		for (int i = 0; i < student_test.length; i++) {
			int score = 0;
			for(int j = 0; j < student_test[i].length; j++) {
				rand_index = rand.nextInt(alternatives.length);
				student_test[i][j] = alternatives[rand_index];
				if (answer_sheet[j] == student_test[i][j]) {
					score++;
				}
			}
			
			System.out.printf("\nStudent %d: " + Arrays.toString(student_test[i]), i+1);
			System.out.printf("\nScore: %d\n", score);
		}
		
		input.close();
		
	}
}