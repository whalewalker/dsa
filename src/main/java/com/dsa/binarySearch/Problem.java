package com.dsa.binarySearch;

import java.math.BigInteger;

public class Problem {
    public static BigInteger getAllPossibleAlphabetCount (String alphabet){
        if (alphabet.length() == 1) {
            return BigInteger.ONE;
        } else {
            return getAllPossibleAlphabetCount(alphabet.substring(0, alphabet.length() - 1)).multiply(BigInteger.valueOf(alphabet.length()));
        }
    }

    public String getAllPermutation(String alphabet){

        return null;
    }

    public static void main(String[] args) {
        System.out.println( getAllPossibleAlphabetCount("ABCD"));
    }
}
