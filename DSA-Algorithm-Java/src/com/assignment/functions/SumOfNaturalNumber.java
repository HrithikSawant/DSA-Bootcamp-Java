package com.assignment.functions;

import java.util.Scanner;

public class SumOfNaturalNumber {
    //Write a function that returns the sum of first n natural numbers.
    public static void main(String[] args) {

        int a = Integer.MIN_VALUE;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n Natural number :");
        int n = sc.nextInt();
        sc.close();

        int ans = sumOfNaturalNumber(n);
        if(ans != -1){
            System.out.println("Sum of natural number "+n+" is "+ans);
        }else {
            System.out.println("Please Enter Natural Number");
        }
    }
    static int sumOfNaturalNumber(int num){
        if(num <= 0){
            return -1;
        }

        int sum = 0;
        for(int i = 1;i <=num;i++){
            sum += i;
        }
        return sum;
    }
}
