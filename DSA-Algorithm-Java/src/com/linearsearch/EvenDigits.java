package com.linearsearch;

public class EvenDigits {
    // https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
    public static void main(String[] args) {
        int[] arr = {12,345,23,6,7896};
        System.out.println(findNumbers(arr));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if(even1(num)){
                count ++;
            }
        }
        return count;
    }

    static int digits2(int num){
        return (int)(Math.log10(num) + 1);
    }

    static boolean even(int num) {
        int count = 0;
        while(num > 0){
            count ++;
            num = num / 10;

        }
        if(count % 2 == 0){
            return true;
        }
        return false;
    }

    static boolean even1(int num) {
        int digit = digits2(num);

        if(digit % 2 == 0){
            return true;
        }
        return false;
    }


}
