package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Anagram {

    public boolean isAnagram(String first, String second) {

        ArrayList<Character> firstLetters = new ArrayList<>();
        ArrayList<Character> secondLetters = new ArrayList<>();


        for (int i = 0; i < first.length(); i++) {
            firstLetters.add(first.charAt(i));
            secondLetters.add(second.charAt(i));
        }

        Collections.sort(firstLetters);
        Collections.sort(secondLetters);


        return (firstLetters.equals(secondLetters));

    }
}
