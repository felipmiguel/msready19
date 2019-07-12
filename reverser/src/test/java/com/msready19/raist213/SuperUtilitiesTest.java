package com.msready19.raist213;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SuperUtilitiesTest {

    @Test
    public void doReverse() {
        String source = "abcde";
        String expected = "edcba";
        SuperUtilities r = new SuperUtilities();
        String actual = r.doReverse(source);
        assertEquals(expected, actual);
    }
}
