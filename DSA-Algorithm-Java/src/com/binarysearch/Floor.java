package com.binarysearch;

public class Floor {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 7, 8, 23, 45, 67, 89};
        int target = 89;
        System.out.println(floor(arr, target));
    }

    private static int floor(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end){
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
        return end;
    }
}
