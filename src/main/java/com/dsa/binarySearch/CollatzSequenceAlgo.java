package com.dsa.binarySearch;

public class CollatzSequenceAlgo {
    public static int collatzSequence(int number){
        if (number == 1)
            return 1;
        if (number % 2 == 0)
            return collatzSequence(number / 2) + 1;
        else
            return collatzSequence(3 * number + 1) + 1;

    }

}
