package main.java.iwp.utils;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ArmstrongTest {
    Armstrong armstrong;

    @Before
    public void setUp() {
    armstrong = new Armstrong();
    }

    @Test
    public void returnFalseFor123() {
        boolean result = armstrong.check(123);

        assertFalse(result);
    }

    @Test
    public void returnTrueFor153() {
        boolean result = armstrong.check(153);

        assertTrue(result);
    }

    @Test
    public void returnTrueFor371() {
        boolean result = armstrong.check(371);

        assertTrue(result);
    }

    @Test
    public void returnTrueFor1634() {
        boolean result = armstrong.check(1634);

        assertTrue(result);
    }
}
