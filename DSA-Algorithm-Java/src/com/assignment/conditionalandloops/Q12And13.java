package com.assignment.conditionalandloops;

import java.util.Scanner;

public class Q12And13 {
        //Perimeter Of Equilateral Triangle
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter side :");
            double side = sc.nextDouble();
            sc.close();

            double perimeter = 4 * side;
            System.out.println("Perimeter of Square is "+perimeter);
            System.out.println("Perimeter of Rhombus is "+perimeter);
        }
}
