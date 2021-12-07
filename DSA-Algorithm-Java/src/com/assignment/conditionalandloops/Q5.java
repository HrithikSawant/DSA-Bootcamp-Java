package com.assignment.conditionalandloops;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        //Area Of Parallelogram
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base :");
        double base = sc.nextDouble();

        System.out.print("\nEnter Height :");
        double height = sc.nextDouble();
        sc.close();

        double Area = base * height;
        System.out.println("Area of Parellelogram is "+Area);

    }
}
