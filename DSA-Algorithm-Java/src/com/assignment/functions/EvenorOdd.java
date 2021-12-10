package com.assignment.functions;

import java.util.Scanner;

public class EvenorOdd {
    //Define a program to find out whether a given number is even or odd.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int num = sc.nextInt();
        evenOrOdd(num);

        System.out.println(evenOrOdd1(num));
    }
    static void evenOrOdd(int num){
        if(num%2==0){
            System.out.println("It is Even number");
        }else{
            System.out.println("It is Odd number");
        }
    }


    static String evenOrOdd1(int num){
        if(num%2==0){
            return "It is Even number";
        }else{
            return "It is Odd number";
        }
    }
}
