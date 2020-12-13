package Map;

import java.awt.font.FontRenderContext;
import java.util.Arrays;
import java.util.HashMap;

public class MapIntro1 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        System.out.println("üres-e: " + map.isEmpty());
        map.put(97, "a");
        map.put(98, "b");
        map.put(99, "c");
        map.put(65, "A");
        map.put(66, "B");
        map.put(67, "C");
        for (Integer element: map.keySet()
             ) {
            System.out.println(element + map.get(element));
        }
        map.put(68, "D");
        System.out.println(map.size());
        System.out.println(map.get(99));
        System.out.println(map.get(97) + " 97");
        System.out.println(map.get(100) == null);
        map.clear();


    }
}
