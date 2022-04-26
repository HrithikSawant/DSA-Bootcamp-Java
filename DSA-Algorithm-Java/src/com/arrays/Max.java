package com.arrays;

public class Max {

    public static void main(String[] args) {
        int[] arr = {12,34,2,21,44,5,1};
        int maximum = max(arr);
        System.out.println(maximum);
        maximum = maxRange(arr,1,3);
        System.out.println(maximum);
    }
    //Find the maximum item in the array
    static int max(int[] arr){
        if(arr.length == 0){
            return -1;
        }
        int max = arr[0];
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
    //Q: Find the maximum in specific range
    static int maxRange(int[] arr,int start,int end){
        if(end > start){
            return -1;
        }
        if(arr == null){
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i]>maxVal){
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}

