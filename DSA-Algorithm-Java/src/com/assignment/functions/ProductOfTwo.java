package com.assignment.functions;

import java.util.Scanner;

public class ProductOfTwo {
    // Define a method that returns the product of two numbers entered by user.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two number by giving space");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();

        int ans = product(num1,num2);
        System.out.println("Product of two number is "+ans);
    }
    static int product (int num1,int num2){
        int product = num1 * num2;
        return product;
    }

}
