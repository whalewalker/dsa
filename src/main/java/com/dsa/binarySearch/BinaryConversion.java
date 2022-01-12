package com.dsa.binarySearch;

public class BinaryConversion {
    public static int baseToInteger(String number, int base){
        return Integer.parseInt(number, base);
    }

    public static void main(String[] args) {
        System.out.println(baseToInteger("30213", 4));
    }
}
