package com.assignment.firstjava;
//Q Take a number as input and print the multiplication table for it.
import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();
        int count = 1;
        int result;

        System.out.println("Table of "+num);
        while(count<=10){
            result = num * count;
            System.out.println(num+" x "+count+" = "+result);
            count++;
        }
    }
}
