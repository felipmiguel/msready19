package com.msready19.raist213;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

public class SuperUtilities implements Reverser {
    public String doReverse(String source) {
        int length = source.length();
        char[] tmpResult = new char[length];
        for (int i = 0; i < length; i++) {
            tmpResult[i] = source.charAt(length - i - 1);
        }
        return new String(tmpResult);
    }

    // for lists
    public static <T, U> List<U> convertList(List<T> from, Function<T, U> func) {
        return from.stream().map(func).collect(Collectors.toList());
    }

    // for arrays
    public static <T, U> U[] convertArray(T[] from, Function<T, U> func, IntFunction<U[]> generator) {
        return Arrays.stream(from).map(func).toArray(generator);
    }
}