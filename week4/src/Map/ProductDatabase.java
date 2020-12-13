package Map;

import org.w3c.dom.ls.LSOutput;

import java.util.HashMap;
import java.util.Map;

public class ProductDatabase {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Eggs", 200);
        map.put("Milk", 200);
        map.put("Fish", 400);
        map.put("Apples", 150);
        map.put("Bread", 50);
        map.put("Chicken", 550);
        System.out.println("How much is the fish?");
        System.out.println(map.get("Fish"));
        System.out.println("Melyik a legdrágább termék?");
        int mostExpensive = 0;
        for (Integer element : map.values()
        ) {
            if (element > mostExpensive) {
                mostExpensive = element;
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()
        ) {
            if (entry.getValue().equals(mostExpensive)) {
                System.out.println(entry.getKey() + " (" + mostExpensive + ")");
            }

        }

        System.out.println("Mi a termékek átlag ára?");
        int sum = 0;
        for (Integer element : map.values()
        ) {
            sum += element;
        }
        System.out.println(sum / map.size());

        System.out.println("Hány termék ára van 300 alatt?");
        int counter = 0;
        for (Map.Entry<String, Integer> entry2 : map.entrySet()
        ) {
            if (entry2.getValue() < 300) {
                counter++;
            }
        }
        System.out.println(counter);
        System.out.println("Van-e olyan termék melyet pontosan 200Ft-ért tudunk megvenni?");
        for (Map.Entry<String, Integer> entry3 : map.entrySet()
        ) {
            if (entry3.getValue() == 200) {
                System.out.print(entry3.getKey() + " ");
            }
        }
        System.out.println();
        System.out.println("Melyik a legolcsóbb termék?");
        int cheapest = 2147483647;
        for (Integer element : map.values()
        ) {
            if (element < cheapest) {
                cheapest = element;
            }
        }
        for (Map.Entry<String, Integer> entry5 : map.entrySet()
        ) {
            if(entry5.getValue().equals(cheapest)) {
                System.out.println(entry5.getKey() + " (" + cheapest + ")");
            }

        }

    }

}
