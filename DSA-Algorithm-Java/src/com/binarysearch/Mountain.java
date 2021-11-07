package com.binarysearch;

public class Mountain {
    public static void main(String[] args) {

    }
    //https://leetcode.com/problems/peak-index-in-a-mountain-array/
    public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length -1;

        while(start < end){
            int mid = start + (end - start) /2;

            if(arr[mid] > arr[mid+1]){
                // you are in descending order of array
                // this may be the potential ans, but look at left
                end = mid;
            }else{
                // you are in asceding  order of array
                // this may be the potential ans, but look at right
                start = mid + 1; // because we know that mid + 1 is greater then mid plus 1;
            }
        }
        // In the end start == end , so we know this is largest no , because of the two check above
        // start and end are always trying to max element in the above 2 check
        //hence, when the both point at same element that is the max element
        return start; // or return end
    }
}
