package com.assignment.conditionalandloops;
import java.util.Scanner;

public class Q10 {
   // Perimeter Of Parallelogram
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter side: ");
       double a = sc.nextDouble();
       System.out.println("Enter Base: ");
       double b = sc.nextDouble();

       double perimeter = 2* (a+b);
       System.out.println("Perimeter of Parallelogram is "+perimeter);


   }
}
