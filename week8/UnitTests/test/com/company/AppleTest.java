package com.company;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;


public class AppleTest {

    @Test
    public void AppleStringShouldBeReturned() {

        Apple apple = new Apple();

        Assert.assertEquals("apple", apple.getApple());
    }

    @Test
    public void OtherStringShouldNotBeTheSame() {

        Apple apple = new Apple();

        Assert.assertNotEquals("peach", apple.getApple());
    }
}