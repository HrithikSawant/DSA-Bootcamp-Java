package com.assignment.conditionalandloops;

import java.util.Scanner;

public class Q8 {
    //Perimeter Of Circle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius :");
        double radius = sc.nextDouble();
        sc.close();

        //
        double circumference = 2 * (Math.PI * radius);
        System.out.printf("Perimeter of circle is %.3f",circumference);


    }
}
