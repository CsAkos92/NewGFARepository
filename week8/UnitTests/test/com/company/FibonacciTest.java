package com.company;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.security.PublicKey;

import static org.junit.Assert.*;

public class FibonacciTest {

    Fibonacci fibonacci;

    @Before
    public void beforeTest() {
        fibonacci = new Fibonacci();
    }

    @Test
    public void fibonacciShouldReturnTheSameNumber() {

        Assert.assertEquals(144, fibonacci.fibonacci(13));
    }

    @Test
    public void fibonacciShouldReturnOne() {

        Assert.assertEquals(1, fibonacci.fibonacci(2));
        Assert.assertEquals(1, fibonacci.fibonacci(3));

    }

}