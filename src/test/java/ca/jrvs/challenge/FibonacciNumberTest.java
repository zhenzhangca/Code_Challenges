package ca.jrvs.challenge;

import org.junit.Test;

import static org.junit.Assert.*;

public class FibonacciNumberTest {
    private FibonacciNumber fibonacciNumber = null;

    @Test
    public void fibRecursion() {
        fibonacciNumber = new FibonacciNumber();
        int output1 = fibonacciNumber.fibRecursion(2);
        assertEquals(1, output1);
        int output2 = fibonacciNumber.fibRecursion(3);
        assertEquals(2, output2);
        int output3 = fibonacciNumber.fibRecursion(4);
        assertEquals(3, output3);
    }

    @Test
    public void fibDP() {
        fibonacciNumber = new FibonacciNumber();
        int output1 = fibonacciNumber.fibDP(2);
        assertEquals(1, output1);
        int output2 = fibonacciNumber.fibDP(3);
        assertEquals(2, output2);
        int output3 = fibonacciNumber.fibDP(4);
        assertEquals(3, output3);
    }
}