package Map;

import java.util.HashMap;
import java.util.Map;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("William A. Lathan", "405-709-1865");
        map.put("John K. Miller", "402-247-8568");
        map.put("Hortensia E. Foster", "606-481-6467");
        map.put("Amanda D. Newland", "319-243-5613");
        map.put("Brooke P. Askew", "307-687-2982");
        System.out.println("Mi John K. Miller telefonszáma?");
        System.out.println(map.get("John K. Miller"));
        System.out.println("Kinek a száma a 307-687-2982?");
        for (Map.Entry<String, String> entry : map.entrySet()
        ) {
            if (entry.getValue().equals("307-687-2982")) {
                System.out.println(entry.getKey());
            }

        }
        System.out.println("Tudjuk-e Chris E. Myer telefonszámát?");
        System.out.println(map.containsKey("Chris E. Myer"));

    }
}
