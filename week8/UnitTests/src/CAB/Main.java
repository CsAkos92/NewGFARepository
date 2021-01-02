package CAB;

public class Main {

    public static void main(String[] args) {

        Calc calc = new Calc();
        calc.instructions();
        CowsAndBulls cowsAndBulls = new CowsAndBulls(calc.randomNumberGenerator());
        System.out.println(cowsAndBulls.getRandomNumber());
        for (int i = 0; i < 100 ; i++) {
            calc.guessResult(calc.scanner(), cowsAndBulls.getRandomNumber());
        }






    }

}
