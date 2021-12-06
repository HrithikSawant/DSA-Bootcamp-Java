package com.bitwiseOperator;

public class FindUnique {
    public static void main(String[] args) {
        //Use XOR
        int[] arr = {2,3,3,4,2,6,4};
        System.out.println(ans(arr));


        //find Unique in negative and positive
        int[] arr1 = {-2,3,2,4,-5,5,-4};
        System.out.println(ans2(arr1));
    }

    private static int ans2(int[] arr) {
        int unique = 0;

        for(int n : arr){
            unique += n;
        }
        return unique;
    }

    private static int ans(int[] arr) {
        int unique = 0;

        for(int n : arr){
            unique ^= n;
        }
        return unique;
    }
}
