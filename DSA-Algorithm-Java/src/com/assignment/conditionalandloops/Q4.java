package com.assignment.conditionalandloops;

import java.awt.geom.Area;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        // Area Of Isosceles Triangle

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter same sides of triangle");
        double a = sc.nextDouble();

        System.out.println("Enter base of triangle");
        double b = sc.nextDouble();
        sc.close();

        //area=(b/4)*Math.sqrt((4*a*a)-(b*b));
        double Area = 0.5 * b * Math.sqrt(a*a-(b*b/4));
        System.out.println("Area of isoceles : "+Area);
    }
}
