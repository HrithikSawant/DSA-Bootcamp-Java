package com.binarysearch;

public class OrderAgnosticBS {
    public static void main(String[] args) {
//        int[] arr = {-18,-11,-7,-2,0,5,9,11,12,15,50};
        int[] arr = {99,88,55,22,10,3,0,-2,-4,-9,-13};
        int target = 3;
        System.out.println(orderAgnosticBS(arr,target));
    }
    static int orderAgnosticBS(int[] arr,int target){
        int start = 0;
        int end = arr.length -1;

        // find whether arr is in ascending or descending order;
        boolean isAsc = arr[start] < arr[end];

            while(start <= end) {
                int mid = start + (end - start) / 2;

                if(arr[mid] == target){
                    return mid;
                }

                if(isAsc){
                    if (target < mid) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }else {
                    if (target > mid) {
                        end = mid - 1;
                    } else {
                        start = mid + 1;
                    }
                }
            }
        return -1;
    }
}
