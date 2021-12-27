package com.sorting;

import java.util.Arrays;

public class selectionSort {
    public static void main(String[] args) {
        int[] arr = {5,3,2,1,4};
        selection(arr);
        System.out.println(Arrays.toString(arr));
        selection1(arr);
        System.out.println(Arrays.toString(arr));

    }

    static void selection (int[] arr){
        for(int i = 0; i < arr.length;i++){
            //find the max item in the remaining array and swap with its correct index

            int last = arr.length - 1 - i;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    //this is for min logic
    static void selection1 (int[] arr){
        for(int i = arr.length-1; i >= 0;i--){

            int first = arr.length - 1 - i ;
            int minIndex = getMinIndex(arr,first);
            swap(arr,minIndex,first);
        }
    }

    static int getMinIndex(int[] arr, int first) {
        int min= first;
        for(int i = first;i< arr.length;i++){
            if(arr[min]>arr[i]){
                min = i;
            }
        }
        return min;
    }

    private static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int  getMaxIndex(int[] arr,int start,int end){
        int max = start;
        for(int i=  start;i <= end; i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }
}
