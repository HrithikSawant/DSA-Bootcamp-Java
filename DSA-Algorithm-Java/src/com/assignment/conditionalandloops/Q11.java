package com.assignment.conditionalandloops;

import java.util.Scanner;

public class Q11 {
    //Perimeter Of Rectangle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length :");
        double l = sc.nextDouble();
        System.out.print("Enter Breath :");
        double b = sc.nextDouble();

        double perimeter = 2 * ( l + b);
        System.out.println("Perimeter Of Rectangle is "+perimeter);
    }
}
