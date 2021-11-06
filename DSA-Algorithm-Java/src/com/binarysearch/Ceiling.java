package com.binarysearch;

public class Ceiling {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7,8,23,45,67,89};
        int target = 0;
        System.out.println(ceiling(arr,target));
    }

    private static int ceiling(int[] arr, int target) {
        //but what if the target is greater than the greatest number in an array
        if(target > arr [arr.length - 1]){
            return -1;
        }

        int start = 0;
        int end = arr.length -1;


        while(start <= end){
            int mid = start + (end - start) / 2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid + 1;
            }else {

                return mid;
            }
        }
        return start;
    }
}
