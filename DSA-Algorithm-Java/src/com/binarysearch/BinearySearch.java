package com.binarysearch;

public class BinearySearch {
    public static void main(String[] args) {
        int arr[] = {1,3,5,6,7,8,23,45,67,89};
        int target = 89;
        System.out.println(binarySearch(arr,target));
    }
    //return the index
    //return -1 if it does not exits
    static int binarySearch(int[] arr,int target){
        int start = 0;
        int end = arr.length - 1;
        while(start <= end){
            // find the middle element
//            int mid = start + end / 2;  //migth be possible that (start + end) might exceed the integer
                int mid = start + (end - start) / 2;

                if(target < arr[mid]){
                    end = mid -1;
                }else if(target > arr[mid]){
                    start = mid + 1;
                }else {
//                    ans found
                    return mid;
                }
        }
        return -1;
    }
}

