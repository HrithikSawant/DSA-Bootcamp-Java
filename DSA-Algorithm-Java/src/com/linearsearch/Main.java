package com.linearsearch;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,99,34};
        System.out.println(linearSearch(nums,1));

    }
    //search in the array: return the index if item found
    //otherwise if item not found return -1
    static  int linearSearch(int[] arr,int target){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        //run for loop
        for (int index = 0; index < arr.length; index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        //Not found
        return -1;
    }

    //Search the target and return the element itself
    static  int linearSearch1(int[] arr,int target){
        if(arr.length == 0){
            return -1;
        }

        //run for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }

        //Not found
        return Integer.MAX_VALUE;
    }

    //Search the target and return the True || false
    static boolean linearSearch3(int[] arr,int target){
        if(arr.length == 0){
            return false;
        }

        //run for loop
        for (int element : arr) {
            //check for element at every index if it is = target
            if (element == target) {
                return true;
            }
        }

        //Not found
        return false;
    }
}
