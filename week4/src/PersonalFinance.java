import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class PersonalFinance {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(500, 1000, 1250, 175, 800, 120));
        System.out.println(list);
        int sum = 0;
        for (Integer element: list
             ) {
            sum += element;
        }
        System.out.println("Mennyit költöttünk? " + sum);
        Collections.sort(list);
        System.out.println("Melyik volt a legnagyobb kiadásunk? " + list.get(list.size() - 1));
        System.out.println("Melyik volt a legkisseb kiadásunk? " + list.get(0));
        System.out.println("Mennyi volt az átlag kiadásunk? " + sum / list.size());

    }
}
