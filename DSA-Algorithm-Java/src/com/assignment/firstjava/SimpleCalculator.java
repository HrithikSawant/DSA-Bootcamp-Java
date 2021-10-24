package com.assignment.firstjava;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("\nEnter operator '+' for Addition");
            System.out.println("Enter operator '-' for Subtraction");
            System.out.println("Enter operator '*' for Multiplication");
            System.out.println("Enter operator '/' for Division");
            System.out.println("Enter operator 'X' or 'x' for Exit");
            System.out.print("Operator : ");
            char op = sc.next().trim().charAt(0);
            if (op == '+' || op == '-' || op == '*' || op == '/') {
                System.out.print("Enter First Number :");
                int num1 = sc.nextInt();
                System.out.print("Enter Second Number :");
                int num2 = sc.nextInt();
                if (op == '+') {
                    ans = num1 + num2;
                }
                if (op == '-') {
                    ans = num1 - num2;
                }
                if (op == '*') {
                    ans = num1 * num2;
                }
                if (op == '/') {
                    ans = num1;
                    if (num2 != 0) {
                        ans = num1 / num2;
                    }
                }
            } else if (op == 'x' || op == 'X') {
                break;
            } else {
                System.out.println("Invalid Operator");
            }
            System.out.println("Result is : " + ans);
        }
    }
}
