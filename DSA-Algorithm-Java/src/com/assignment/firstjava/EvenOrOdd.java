//Write a program to print whether a number is even or odd, also take input.
package com.assignment.firstjava;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        sc.close();
        if(num%2==0){
            System.out.println(num + " is a Even Number");
        }else {
            System.out.println(num +" is a Odd Number");
        }
    }
}
