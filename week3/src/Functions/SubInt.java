package Functions;

public class SubInt {
    public static void main(String[] args) {
        subInt(9, new int[]{5, 6, 11, 1, 22, 112, 76, 43, 99, 29, 109});

    }

    public static void subInt(int number, int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (number == array[i] || number == array[i] / 10 || number == array[i] / 100 || number == array[i] % 10 || number == array[i] % 100) {
                System.out.print(i + " ");
            }
        }

    }
}
