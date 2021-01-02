package com.company;

import java.util.HashMap;

public class LetterCounter {

    public HashMap<Character, Integer> letterCounter(String input) {

        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if(hash.get(input.charAt(i)) != null) {
                hash.put(input.charAt(i),(hash.get(input.charAt(i)) + 1 ));
            } else {
                hash.put(input.charAt(i), 1);
            }
        }
        return hash;
    }
}

