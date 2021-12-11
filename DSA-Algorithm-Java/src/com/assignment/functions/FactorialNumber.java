package com.assignment.functions;

import java.util.Scanner;

public class FactorialNumber {

//    Write a program to print the factorial of a number by defining a method named 'Factorial'.
//    Factorial of any number n is represented by n! and is equal to 1 * 2 * 3 * .... * (n-1) *n. E.g.-
//            4! = 1 * 2 * 3 * 4 = 24
//            3! = 3 * 2 * 1 = 6
//            2! = 2 * 1 = 2
//    Also,
//            1! = 1
//            0! = 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n Natural number :");
        int n = sc.nextInt();
        sc.close();

        long ans = factorial(n);
        if(ans != -1){
            System.out.println(n+"! = "+ans);
        }else {
            System.out.println("Please Enter valid Number");
        }
    }
    static long factorial(int num){
        if(num < 0){
            return -1;
        }
        if(num == 0){
            return 0;
        }
        if(num == 1){
            return  1;
        }

        long factorial = 1;
        for(int i = 1;i <=num;i++){
            factorial = factorial * i;
        }
        return factorial;
    }
}
