package com.ex;

import org.junit.Assert;
import org.junit.Test;

public class isPrimeTest {

    @Test
    public void check() {
        Assert.assertFalse("false", isPrime.isPrime(20));
        Assert.assertTrue("true", isPrime.isPrime(31));
        Assert.assertFalse("false", isPrime.isPrime(1));
        Assert.assertTrue("true", isPrime.isPrime(29));
        Assert.assertFalse("false", isPrime.isPrime(0));
    }
}
