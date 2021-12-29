package com.cyclicquestion;
//https://leetcode.com/problems/find-the-duplicate-number/
public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,1};
        System.out.println(findDuplicate1(nums));
    }
    public static int findDuplicate(int[] nums) {
        int duplicate = nums.length -1;
        int i =0;
        while(i<nums.length){
            int correct = nums[i] - 1;
            if(nums[i]!=nums[correct]){
                swap(nums,i,correct);
            }else{
                i++;
            }
        }
        //search for duplicate number
        for(int index = 1; index < nums.length; index++){
            if(nums[index]!= index){
                duplicate =  nums[index];
            }
        }
        return duplicate;
    }

    public static int findDuplicate1(int[] nums) {
        int i =0;
        while(i<nums.length){
            if(nums[i] != i+1) {
                int correct = nums[i] - 1;
                if (nums[i] != nums[correct]) {
                    swap(nums, i, correct);
                } else {
                    return nums[i];
                }
            } else {
                i++;
            }
        }
        return -1;
    }


    private static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;
    }
}
