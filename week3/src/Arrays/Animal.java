package Arrays;

public class Animal {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr"};

        for (int i = 0; i < animals.length; i++) {
            char ch ='a';
            animals[i] += ch;
        }

        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }
    }
}
