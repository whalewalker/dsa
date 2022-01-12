package com.dsa.binarySearch;

public class CreateLargestNumberFromAList {
//    public static String solve(int[] nums){
//        StringBuilder total = new StringBuilder();
//        for (int num : nums) {
//            total.append(num);
//        }
//
//        for (int i = 0; i < total.length(); i++) {
//
//            // ith character of str
//
//            // Rest of the string after excluding
//            // the ith character
//            String ros = total.substring(0, i) + total.substring(i + 1);
//            System.out.println(total.substring(0, i));
//        }
//            return total.toString();
//    }

    public static String swapString(String a, int i, int j) {
        char[] b = a.toCharArray();
        char ch;
        ch = b[i];
        b[i] = b[j];
        b[j] = ch;
        return String.valueOf(b);
    }

    public static void main(String[] args) {
        System.out.println(swapString("ABC", 1,2 ));
    }
//        String str = "ABDC";
//        int len = str.length();
//        System.out.println("All the permutations of the string are: ");
//        generatePermutation(str, 0, len);
//    }

    //Function for generating different permutations of the string
    public static void generatePermutation(String str, int start, int end) {
        //Prints the permutations
        if (start == end - 1)
            System.out.println(str);
        else {
            for (int i = start; i < end; i++) {
                //Swapping the string by fixing a character
                str = swapString(str, start, i);
                //Recursively calling function generatePermutation() for rest of the characters
                generatePermutation(str, start + 1, end);
                //Backtracking and swapping the characters again.
                str = swapString(str, start, i);
            }
        }

    }
}