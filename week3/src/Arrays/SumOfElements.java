package Arrays;

public class SumOfElements {
    public static void main(String[] args) {
        int[] numbers = {54, 23, 66, 12};
        System.out.println(numbers[1] + numbers[2]);

        int[] numbers2 = {1, 2, 3, 8, 5, 6};
        numbers2[3] = 4;
        System.out.println(numbers2[3]);

        int[] numbers3 = {1, 2, 3, 4, 5};
        numbers3[2] += 1;
        System.out.println(numbers3[2]);

        int[] numbers4 = {4, 5, 6, 7};
        for (int i = 0; i < numbers4.length; i++) {
            System.out.print(numbers4[i]);

        }
    }
}
