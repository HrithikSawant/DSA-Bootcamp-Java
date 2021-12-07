package com.assignment.conditionalandloops;

import java.util.Scanner;

public class Q3 {
    public static void main(String args[]){
        //Q3 Area Of Rectangle Program
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Length: ");
        double length = sc.nextDouble();

        System.out.print("\nEnter Breath: ");
        double breath = sc.nextDouble();
        sc.close();

        double Area = length * breath;
        System.out.println("Area of Rectangle : "+Area);
    }
}
