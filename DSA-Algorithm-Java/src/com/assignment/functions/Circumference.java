package com.assignment.functions;

import java.util.Scanner;

public class Circumference {
    //Write a program to print the circumference and area of a circle of radius entered by user by defining
    // your own method.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of circle :");
        double r =  sc.nextDouble();

        findCircumferenceAndArea(r);
    }
    static void findCircumferenceAndArea(double radius){
        double c = 2 * Math.PI * radius;
        double a = Math.PI * Math.pow(radius,2);
        System.out.println("Circumference is :"+c+"\nArea of circle is :"+a);

    }
}
