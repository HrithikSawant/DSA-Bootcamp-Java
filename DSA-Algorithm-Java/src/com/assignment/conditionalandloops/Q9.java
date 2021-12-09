package com.assignment.conditionalandloops;

import java.util.Scanner;

public class Q9 {
    //Perimeter Of Equilateral Triangle
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side :");
        double side = sc.nextDouble();
        sc.close();

        double perimeter = 3 * side;
        System.out.println("Perimeter of Equilateral Triangle is "+perimeter);
    }
}
