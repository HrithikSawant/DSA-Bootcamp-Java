package com.assignment.conditionalandloops;

import java.util.Scanner;

public class Q14 {
    //Volume Of Cone
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius :");
        double r= sc.nextDouble();
        System.out.print("Enter Height :");
        double h = sc.nextDouble();
        sc.close();

        double v =Math.PI * Math.pow(r,2) * (h/3);
        System.out.printf("Volume of Cone is %.4f",v);
    }
}
