package com.sg.foundations.flowcontrol.arrays;

import java.util.Arrays;

public class SimpleCombination {
    public static void main(String[] args) {
        int[] firstHalf = {3, 7, 9, 10, 16, 19, 20, 34, 35, 45, 47, 49}; // 12 numbers
        int[] secondHalf = {51, 54, 68, 71, 75, 78, 82, 84, 85, 89, 91, 100}; // also 12!

        // Combining code should go here!
        int a1 = firstHalf.length;

        // determines length of secondArray
        int b1 = secondHalf.length;

        // resultant array size
        int c1 = a1 + b1;

        // create the resultant array
        int[] c = new int[c1];

        // using the pre-defined function arraycopy
        System.arraycopy(firstHalf, 0, c, 0, a1);
        System.arraycopy(secondHalf, 0, c, a1, b1);

        // Printing code should go here
        System.out.println(Arrays.toString(c));
    }
}


