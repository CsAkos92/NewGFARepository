import java.util.ArrayList;

public class ListIntro1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        System.out.println(list.size());
        list.add("William");
        System.out.println( list.isEmpty());
        list.add("John");
        list.add("Amanda");
        System.out.println(list.size());
        for (String element: list) {
            System.out.println(element);
        }
        list.remove(1);
        System.out.println("----------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.clear();
    }
}
