package com.dsa.binarySearch;

import java.util.HashMap;
import java.util.Map;

public class LineSegment {
    public static boolean solve(int[][] coordinates) {

        for (int[] rows : coordinates) {
            for (int col = 1; col < rows.length; col += 2) {
                if (rows[col - 1] != rows[col])
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1, 1},
                {2, 2},
                {3, 3},
                {4, 4},
                {5, 5}}));
    }

}
