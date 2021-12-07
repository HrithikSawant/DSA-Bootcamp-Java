package com.assignment.conditionalandloops;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        //Area Of Equilateral Triangle

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sides : ");
        double a = sc.nextDouble();
        sc.close();
        double area = (Math.sqrt(3) / 4) * (a * a);
        System.out.println("\nArea of Equilateral Triangle : "+area);
    }
}
