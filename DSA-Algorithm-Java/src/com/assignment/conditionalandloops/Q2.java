package com.assignment.conditionalandloops;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
    //Q1    Area Of Triangle = base * height
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Base :");
        double base = sc.nextDouble();

        System.out.print("\nEnter Height :");
        double height = sc.nextDouble();
        sc.close();

        double Area = 0.5 * (base * height);
        System.out.println("Area of Triangle is "+Area);

    }
}
