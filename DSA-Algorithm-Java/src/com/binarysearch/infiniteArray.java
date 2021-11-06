package com.binarysearch;
//https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
//dont worry about index out of bound error because it is infinite Array

public class infiniteArray {
    public static void main(String[] args) {
        int[] arr = {3,5,7,9,10,90,100,130,140,160,170};
        int target = 9;
        System.out.println(findingAns(arr,target));
    }
    static int findingAns(int[] arr,int target){
        //first find the range
        //first with a box of chunk 2;
        int start = 0;
        int end = 1;

        //condition to find the target in the chucks
        while(target > arr[end]){
            int temp = end + 1; // this is my new start
            //double the chuck
            //end = previous end + sizeofBox * 2
            end = end + (end - start + 1) * 2;
            start = temp;
        }
        return binarySearch(arr,target,start,end);
    }

    static int binarySearch(int[] arr,int target, int start,int end){

        while(start <= end) {
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
