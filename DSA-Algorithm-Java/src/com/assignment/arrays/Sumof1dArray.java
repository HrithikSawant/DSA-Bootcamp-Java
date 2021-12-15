package com.assignment.arrays;

import java.util.Arrays;

public class Sumof1dArray {
    //https://leetcode.com/problems/running-sum-of-1d-array/
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println(Arrays.toString(runningSum(nums)));
    }
    static int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] sum = new int[n];

        for(int i = 0;i < n;i++){
            for(int j = 0;j <= i;j++){
                sum[i] = sum[i] + nums[j];
            }
        }
        return sum;
    }
}
