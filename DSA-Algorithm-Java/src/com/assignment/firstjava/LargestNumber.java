package com.assignment.firstjava;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Number :");
        int num1 = in.nextInt();
        System.out.print("Enter Second Number :");
        int num2 = in.nextInt();

        int largest = num1;
        if(largest < num2){
            largest = num2;
        }
        System.out.println("Largest Number is :"+largest);
    }
}









