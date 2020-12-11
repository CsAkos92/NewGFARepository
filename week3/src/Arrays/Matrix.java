package Arrays;

import java.lang.reflect.Array;

public class Matrix {
    public static void main(String[] args) {
        int number = 4;
        int[][] numbers = new int[number][number];
        for (int i = 0; i < number; i++) {
            for ( int j = 0; j < number; j++) {
                if (j == i) {
                    numbers[i][j] = 1;
                } else {
                    numbers[i][j] = 0;
                }

            }

        }
        System.out.print(numbers[0][0]);
        System.out.print(numbers[0][1]);
        System.out.println(numbers[0][2]);
        System.out.print(numbers[1][0]);
        System.out.print(numbers[1][1]);
        System.out.println(numbers[1][2]);
        System.out.print(numbers[2][0]);
        System.out.print(numbers[2][1]);
        System.out.println(numbers[2][2]);


    }
}
