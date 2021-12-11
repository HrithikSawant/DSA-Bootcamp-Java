package com.assignment.functions;

import java.util.Scanner;

public class PalindromeNumber {
    //Write a function to find if a number is a palindrome or not. Take number as parameter.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check palindrome or not");
        int num = sc.nextInt();
        sc.close();

        System.out.println(isPalindrome(num));
    }

    static boolean isPalindrome(int num){
        if(num == 0){
            return true;
        }
        int original = num;
        int ans = 0;
        while (num > 0){
            int remainder = num % 10;
            num = num / 10;
            ans = ans * 10 + remainder ;
        }
        return original == ans;
    }


}
