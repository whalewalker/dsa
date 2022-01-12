package com.dsa.binarySearch;

public class NumberPalindrome {
    public static boolean palindrome(int number){
        int reminder;
        int divisor;
        int reverseNumber = 0;
        int length = (int) (Math.log10(number) + 1);
        int copy = number;

        while (number != 0){
            reminder = number % 10;
            divisor = reminder % 10;
            reverseNumber += divisor * Math.pow(10, length - 1);
            length--;
            number /= 10;
        }
        return copy == reverseNumber;
    }

}
