package Arrays;

public class Doubling {
    public static void main(String[] args) {
        int[] numList = {3, 4, 5, 6, 7};

        for (int i = 0; i < numList.length; i++) {
            numList[i] *= 2;
        }
        for (int k = 0; k < numList.length; k++) {
            System.out.print(numList[k] + ", ");
        }
    }
}
