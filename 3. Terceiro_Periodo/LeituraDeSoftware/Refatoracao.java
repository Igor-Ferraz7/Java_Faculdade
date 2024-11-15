package LeituraDeSoftware;

import java.util.Arrays;
import java.util.Random;

public class Refatoracao {
    public static void main(String[] args) {
    }

    static int[] sort_random_vector(int length) {
        int[] vector = creat_random_vector(length);

        for (int j = 1; j < vector.length; j++) {
            int key = vector[j];
            int i = j-1;
            while ( (i > -1) && ( vector [i] > key ) ) {
                vector [i+1] = vector [i];
                i--;
            }
            vector[i+1] = key;
        }

        return vector;

    }

    static int[] creat_random_vector(int length) {
        Random rand = new Random();
        int[] vector = new int[length];

        for (int i = 0; i < length; i++) {
            vector[i] = rand.nextInt(10);
        }

        return vector;

    }

}


