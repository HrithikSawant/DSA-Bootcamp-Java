package com.arrays;

import java.util.Arrays;

public class PassingFunction {
    public static void main(String[] args) {
        int[] nums = {3,4,5,12};
        System.out.println(Arrays.toString(nums));
        change(nums);
    }

    static void change(int[] arr) {
        arr[0] = 99;
        System.out.println(Arrays.toString(arr));
    }
}
