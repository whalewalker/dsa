package com.dsa.binarySearch;

import java.util.Arrays;

public class FirstMissingPositive {

    public static int solution(int[] nums) {
        if (nums.length == 0){
            return 1;
        }
        if (nums.length == 1 && nums[0] != 1){
            return 1;
        }
        int count = 1;
        Arrays.sort(nums);
        int maxValue = Arrays.stream(nums).max().getAsInt();
        for (int num : nums) {
            if (num < 1){
                count = 1;
                continue;
            }
            else if (count != num){
                return count;
            }
            count++;
        }
        return maxValue !=  Math.abs(maxValue) ? 1 : maxValue + 1;
    }


    public static void main(String[] args) {
        System.out.println(solution(new int[]{1, 2, 1}));
    }
}
