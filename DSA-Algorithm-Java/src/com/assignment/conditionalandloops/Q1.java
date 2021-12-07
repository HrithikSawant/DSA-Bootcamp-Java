package com.assignment.conditionalandloops;

import java.util.Date;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
// Q1. Area Of Circle Java Program
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of a Circle");
        float radius =  sc.nextFloat();
        sc.close();

        float PI = 3.14f;
        float Area = PI * radius * radius;
        System.out.println("Area of Circle is "+Area);

    }
}
