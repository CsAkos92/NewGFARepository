package Functions;

import java.util.Arrays;

public class Unique {
    public static void main(String[] args) {
        unique(new int[]{1, 2, 3, 3, 3, 3, 2, 4, 42, 2, 3, 4, 2, 3});

    }

    public static int[] unique(int[] array) {
        Arrays.sort(array);
        int length = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                length++;
            }
        }

        int[] secondArray = new int[length];
        int j = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] != array[i + 1]) {
                secondArray[j] = array[i];
                j++;
            }
        }
        secondArray[secondArray.length - 1] = array[array.length - 1];
        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }
        return secondArray;
    }
}


