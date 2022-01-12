package com.dsa.binarySearch;

import java.util.Set;
import java.util.TreeSet;

public class UnobstructiveBuildingsAlgo {
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
}
