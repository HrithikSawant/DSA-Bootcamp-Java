package com.assignment.arrays;

import java.util.Arrays;

public class PermutationArrays {
    public static void main(String[] args) {
       //int[] nums = {0,2,1,5,3,4};
       int[] nums = {5,0,1,2,3,4};
        System.out.println(Arrays.toString(buildArray(nums)));
    }


    //bruteForce solution
    public static int[] buildArray(int[] nums) {

        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0 ; i< n;i++){
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    //optimized way omeaga(n)
    public static int[] buildArray1(int[] nums){

        int n = nums.length;
        for (int i = 0;i <n ;i++){
            nums[i] = n * (nums[nums[i]] % n) + nums[i];
        }
        for(int i = 0;i<n;i++){
            nums[i] = nums[i] / n;
        }
        return nums;
    }
}


