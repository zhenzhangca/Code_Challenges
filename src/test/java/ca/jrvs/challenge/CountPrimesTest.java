package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountPrimesTest {

    @Test
    public void countPrimes() {
        assertEquals(4, CountPrimes.countPrimes(10));
        assertEquals(2,CountPrimes.countPrimes(4));
    }
}