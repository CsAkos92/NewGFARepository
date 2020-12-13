import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("eggs", "milk", "fish", "apples", "bread", "chicken"));
        System.out.println(list);
        System.out.println("Van tejünk a listán? " + list.contains("milk"));
        System.out.println("Van banánunk  a listán? " + list.contains("banana"));
    }
}
