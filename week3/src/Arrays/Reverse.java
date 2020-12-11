package Arrays;

public class Reverse {
    public static void main(String[] args) {
        int[] numbers = {4, 5, 6, 7};
        int[] reversedNumbers = new int[4];

        for (int i = 0; i < numbers.length; i++) {
            reversedNumbers[reversedNumbers.length - 1 - i] = numbers[i];
        }
        for (int i = 0; i < reversedNumbers.length; i++) {
            System.out.println(reversedNumbers[i]);
        }
    }
}
