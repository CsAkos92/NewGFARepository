package Functions;

public class Factorio {
    public static void main(String[] args) {
        System.out.println(factorio(5));

    }
    public static int factorio(int number) {
        int sum = 1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;
    }
}
