import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListIntro2 {
    public static void main(String[] args) {
        ArrayList<String> listA = new ArrayList<String>(Arrays.asList("Apple", "Avocado", "Blueberries", "Durian", "Lychee"));
        ArrayList<String> listB = new ArrayList<>();
        listB = listA;
        System.out.println(listB);
        listB.remove("Durian");
        listA.add("Kivifruit");
        if (listA.size() < listB.size()) {
            System.out.println("B nagyobb");
        } else if(listA.size() > listB.size()) {
            System.out.println("A nagyobb");
        } else {
            System.out.println("A ket lista egyenlo meretu");
        }
        System.out.println(listA.indexOf("Avocado"));
        System.out.println(listB.indexOf("Durian"));
        Collections.addAll(listB, "Passion Fruit", "Pomelo");
        System.out.println(listA.get(2));
    }
}
