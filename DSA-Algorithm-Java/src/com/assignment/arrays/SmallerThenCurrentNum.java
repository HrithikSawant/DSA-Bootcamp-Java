package com.assignment.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class SmallerThenCurrentNum {
    public static void main(String[] args) {
     int[] nums = {7,7,7,7};
     int[] result = smallerNumbersThanCurrent(nums);
     System.out.println(Arrays.toString(result));

    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0;i< nums.length;i++){
            int count = 0;
            for(int j = 0;j<nums.length;j++){
                if(j != i & nums[j]<nums[i]){
                    count++;
                }
            }
            ans[i] = count;

        }
        return  ans;
    }
}
