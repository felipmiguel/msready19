package com.msready19.raist213;

import org.junit.Test;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;



public class SuperUtilitiesTest {

    @Test
    public void doResverse(){
        String source="abcde";
        String expected = "edcba";
        SuperUtilities r = new SuperUtilities();
        String actual = r.doReverse(source);
        assertEquals(expected, actual);
    }

    @Test
    public void convertList(){
        List<Integer> lotOfIntegers = Arrays.asList(1, 2, 3, 4, 5);
        List<String> actuals = SuperUtilities.convertList(lotOfIntegers, i -> i.toString());
        assertArrayEquals(new String[]{"1", "2", "3", "4", "5"}, actuals.toArray());
    }

}