package com.msready19.raist213;

public class SuperUtilities {
    public String doReverse(String source) {
        int length = source.length();
        char[] tmpResult = new char[length];
        for (int i = 0; i < length; i++) {
            tmpResult[i] = source.charAt(length - i - 1);
        }
        return new String(tmpResult);
    }
}
