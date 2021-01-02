package CAB;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Calc {

    public int scanner() {
        Scanner scan = new Scanner(System.in);
        int inputNumber = scan.nextInt();
        if (inputNumber > 9999) {
            System.out.println("Tul nagy szamot adtal meg.");
        } else if (inputNumber < 1000) {
            System.out.println("Tul kicsi szamot adtal meg.");
            return 0;
        }

        return inputNumber;
    }

    public int randomNumberGenerator() {
        Random rand = new Random();
        return (rand.nextInt(9000 + 1000));
    }

    public void instructions() {
        System.out.println("Guess a 4 digit number!");
        System.out.println("If the matching digits are in their right positions, they are \"bulls\", if in different positions, they are \"cows\".");
    }

    public void guessResult(Integer inputNumber, Integer randomNumber) {

        if(inputNumber < 1000) {
            throw new UnsupportedOperationException("Csak 4 jegyu szamokat adhatsz meg.");
        }


        int countBull = 0;
        int countCow = 0;

        int[] array1 = new int[10];
        int[] array2 = new int[10];


        for (int i = 1; i < randomNumber.toString().length(); i++) {
            char randomChar = randomNumber.toString().charAt(i);
            char guessedChar = inputNumber.toString().charAt(i);

            if (randomChar == guessedChar) {
                countBull++;
            } else {
                array1[randomChar - '0']++;
                array2[guessedChar - '0']++;
            }
        }
        for (int j = 0; j < 10; j++) {
            countCow += Math.min(array1[j], array2[j]);
        }
        System.out.println("Bulls: " + countBull);
        System.out.println("Cows: " + countCow);

    }
}
