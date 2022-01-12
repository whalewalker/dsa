package com.dsa.binarySearch;

import java.util.Arrays;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class DetectVotersFraud {
    public static boolean solve(int[][] votes) {
        Map<Integer, Boolean> checker = new HashMap<>();
        for (int[] rows : votes) {
            if (checker.containsKey(rows[1]))
                return true;
            else
                checker.put(rows[1], true);
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{2, 3},
                {2, 2},
                {2, 1},
                {2, 0},
                {2, 5}}));
    }
}
