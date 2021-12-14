package com.dsa.binarySearch;

import java.util.*;

public class BinarySearchAlgorithmsQuestions {
    public static int collatzSequence(int number){
        if (number == 1)
            return 1;
        if (number % 2 == 0)
           return collatzSequence(number / 2) + 1;
        else
            return collatzSequence(3 * number + 1) + 1;

    }

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

    public static int[] unobstructedBuildings(int[] heights){
        if(heights.length == 0){
            return new int[]{};
        }
        if (heights.length == 1){
            return new int[]{0};
        }
        int count = 1;
        Set<Integer> integers = new TreeSet<>();
        for(int index = 0; index < heights.length; index++){
           while (count < heights.length){
               if (heights[index] > heights[count]){
                   count++;
               }else {
                   break;
               }
               if (count == heights.length){
                   integers.add(index);
               }
           }
            count = index + 2;
        }
        integers.add(heights.length - 1);
        return integers.stream().mapToInt(Integer::intValue).toArray();
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(unobstructedBuildings(new int[]{2, 1, 2})));
    }
}
