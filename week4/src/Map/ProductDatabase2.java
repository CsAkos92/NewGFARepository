package Map;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Eggs", 200);
        map.put("Milk", 200);
        map.put("Fish", 400);
        map.put("Apples", 150);
        map.put("Bread", 50);
        map.put("Chicken", 550);
        System.out.println("Mely termékek kerülnek kevesebbe mint 201?");
        for (Map.Entry <String, Integer> entry : map.entrySet()
             ) {
            if(entry.getValue() < 201) {
                System.out.println(entry.getKey());
            }
        }
        System.out.println("--------");
        System.out.println("Mely termékek kerülnek többe mint 150?");
        for (Map.Entry<String, Integer> entry2 : map.entrySet()
             ) {
            if(entry2.getValue() > 150) {
                System.out.println(entry2.getKey() +" (" + entry2.getValue() + ")");
            }

        }
    }
}
