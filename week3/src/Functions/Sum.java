package Functions;

public class Sum {
    public static void main(String[] args) {
        System.out.println(sum(6));

    }

    public static int sum(int number) {
        int summa = 0;
        for (int i = 1; i <= number; i++) {
            summa += i;
        }
        return summa;
    }
}

