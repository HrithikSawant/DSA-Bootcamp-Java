package com.cyclicquestion;

import java.util.ArrayList;
import java.util.List;

//find all disappearedNumber leetcode
public class FindAllMissing {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1};
        List<Integer> list = findDisappearedNumbers(arr);
        System.out.println(list);
    }
    public static List<Integer> findDisappearedNumbers(int[] nums){
        int i = 0;
        while(i < nums.length){
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]){
                swap(nums,i,correct);
            } else {
                i++;
            }
        }
        //find missing Numbers
        List<Integer> ans = new ArrayList<>();
        for (int index = 0; index < nums.length; index ++){
            if (nums[index] != index+1){
                ans.add(index + 1);
            }
        }
        return ans;
    }

    static void swap(int[] arr,int first,int secound){
        int temp = arr[first];
        arr[first] = arr[secound];
        arr[secound] = temp;
    }
}

