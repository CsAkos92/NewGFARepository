package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void anagramShouldBeTheSame() {
        Anagram anagram = new Anagram();
        Assert.assertEquals(true, anagram.isAnagram("rost", "sort"));
    }

    @Test
    public void sameWorldShouldBeTrueWithDifferentOrderOfTheLetters() {
        Anagram anagram = new Anagram();
        Assert.assertEquals(true, anagram.isAnagram("satu", "satu"));
        Assert.assertEquals(true, anagram.isAnagram("satu", "utas"));

    }

}