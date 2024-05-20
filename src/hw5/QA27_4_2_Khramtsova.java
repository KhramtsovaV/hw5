package hw5;

import java.util.Random;

public class QA27_4_2_Khramtsova {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] array = new int[3][3];
        int sum = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array[i][j] = random.nextInt(10);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                sum += array[i][j];
            }
        }

        System.out.println("Sum array: " + sum);
    }
}


