package com.assignment.firstjava;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle :");
        float Principle =  sc.nextFloat();
        System.out.print("Enter Rate of interest :");
        float rate =  sc.nextFloat();
        System.out.print("Enter Time Period :");
        float time =  sc.nextInt();


        System.out.print("Simple Interest is:");
        float SI = (Principle * time * rate)/100;
        System.out.println(SI);
    }
}
