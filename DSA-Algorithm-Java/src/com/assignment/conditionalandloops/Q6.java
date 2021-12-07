package com.assignment.conditionalandloops;

import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        //Area Of Rhombus
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st Diagonal");
        double p = sc.nextDouble();

        System.out.print("\nEnter 2nd Diagonal");
        double q = sc.nextDouble();
        sc.close();

        if(p <= 0 || q <= 0){
            System.out.println("Length should be in Positive");
        }else{
            double area = (p*q)/2;
            System.out.println("Area of Rhombus : "+area);
        }
    }
}
