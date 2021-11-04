package com.linearsearch;

public class SearchInRange {
    public static void main(String[] args) {
    int[] arr = {18,12,-7,3,14,28};
    int target = 28;
        System.out.println(linearSearch(arr,target,2,4));
    }
    //Q Search for 3 in the range for index [1,4]
    static  int linearSearch(int[] arr,int target,int start, int end){
        if(arr.length == 0){
            return Integer.MAX_VALUE;
        }

        //run for loop
        for (int index = start; index <= end ;index++) {
            //check for element at every index if it is = target
            int element = arr[index];
            if(element == target){
                return index;
            }
        }

        //Not found
        return -1;
    }

}
