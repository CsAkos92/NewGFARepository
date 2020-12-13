package Map;

import java.util.HashMap;
import java.util.Map;

public class ShoppingList2 {
    public static void main(String[] args) {
        HashMap<String, Double> products = new HashMap<>();
        products.put("Milk", 1.07);
        products.put("Rice", 1.59);
        products.put("Eggs", 3.14);
        products.put("Cheese", 12.6);
        products.put("Chicken breast", 9.40);
        products.put("Apples", 2.31);
        products.put("Tomato", 2.58);
        products.put("Potato", 1.75);
        products.put("Onion", 1.1);

        HashMap<String, Integer> listOfBob = new HashMap<>();
        listOfBob.put("Milk", 3);
        listOfBob.put("Rice", 2);
        listOfBob.put("Eggs", 2);
        listOfBob.put("Cheese", 1);
        listOfBob.put("Chicken Breasts", 1);
        listOfBob.put("Apples", 1);
        listOfBob.put("Tomato", 2);
        listOfBob.put("Potato", 1);

        HashMap<String, Integer> listOfAlice = new HashMap<>();
        listOfBob.put("Rice", 1);
        listOfBob.put("Eggs", 5);
        listOfBob.put("Chicken Breasts", 2);
        listOfBob.put("Apples", 1);
        listOfBob.put("Tomato", 10);



    }
}
