package com.assignment.functions;

import java.util.Scanner;

public class EligibleorNot {
    //A person is eligible to vote if his/her age is greater than or equal to 18.
    // Define a method to find out if he/she is eligible to vote.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Age :");
        int age = sc.nextInt();
        sc.close();
        isEligible(age);
    }

    static void isEligible(int age){
        if(age >= 18){
            System.out.println("You are Eligible");
        }else {
            System.out.println("Not Eligible");
        }
    }

}
