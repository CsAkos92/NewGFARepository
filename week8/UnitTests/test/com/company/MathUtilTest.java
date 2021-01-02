package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MathUtilTest {

    @Test
    public void addShouldCorrectlyAddTwoNumbers() {
        MathUtil mathUtil = new MathUtil();
        int expected = 3;
        int result = mathUtil.add(1, 2);
        Assert.assertEquals(expected, result);
    }

}