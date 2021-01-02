package com.company;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ExtensionTest {

    Extension extension;

    @Before
    public void beforeTest() {
        extension = new Extension();
    }

    @Test
    public void testAdd_2and3is5() {
        assertEquals(5, extension.add(2, 3));

        assertEquals(15, extension.add(7, 8));


    }

    @Test
    public void testAdd_1and4is5() {
        assertEquals(5, extension.add(1, 4));
        assertEquals(-3, extension.add(1, -4));
    }

    @Test
    public void testMaxOfThree_first() {
        assertEquals(9, extension.maxOfThree(5, 4, 9));
    }

    @Test
    public void testMaxOfThree_third() {
        assertEquals(6, extension.maxOfThree(6, 6, 5));
    }

    @Test
    public void testMedian_four() {
        assertEquals(7, extension.median(Arrays.asList(7,9,7,5)));
    }

    @Test
    public void testMedian_five() {
        assertEquals(4, extension.median(Arrays.asList(2,3,4,5,6)));
    }

    @Test
    public void testIsVowel_a() {
        assertTrue(extension.isVowel('ú'));
    }

    @Test
    public void testIsVowel_u() {
        assertTrue(extension.isVowel('ó'));
    }

    @Test
    public void testTranslate_bemutatkozik() {
        assertEquals("bevemuvutavatkovozivik", extension.translate("bemutatkozik"));
    }

    @Test
    public void testTranslate_lagopus() {
        assertEquals("lavagovopuvus", extension.translate("lagopus"));
    }
}