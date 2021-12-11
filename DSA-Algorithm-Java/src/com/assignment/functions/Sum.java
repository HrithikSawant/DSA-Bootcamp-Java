package com.assignment.functions;

import java.util.Scanner;

public class Sum {
    //Write a program to print the sum of two numbers entered by user by defining your own method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number by giving space");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        sum(num1,num2);
    }
    static void sum(int num1,int num2){
        int sum = num1 + num2;
        System.out.println("Sum of two number is "+sum);
    }
}
