package com.company;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class LetterCounterTest {

    @Test
    public void returnedHashmapShouldBeTheSame() {

        LetterCounter letterCounter = new LetterCounter();

        HashMap<Character, Integer> expectedHash = new HashMap<>() {
            {
                put('a', 1);
                put('p', 2);
                put('l', 1);
                put('e', 1);
            }
        };

        HashMap<Character, Integer> actualHash = letterCounter.letterCounter("apple");

        Assert.assertEquals(expectedHash, actualHash);
    }

    @Test
    public void tripleLetterHashShouldBeTheSame() {

        LetterCounter letterCounter = new LetterCounter();

        HashMap<Character, Integer> expectedHash = new HashMap<>() {
            {
                put('s', 1);
                put('a', 3);
                put('l', 1);
                put('m', 1);
                put('n', 1);
                put('d', 1);
                put('e', 1);
                put('r', 1);
            }
        };

        HashMap<Character, Integer> actualHash = letterCounter.letterCounter("salamander");

        Assert.assertEquals(expectedHash, actualHash);
    }

}