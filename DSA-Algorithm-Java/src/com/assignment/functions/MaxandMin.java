package com.assignment.functions;

import java.util.Scanner;

public class MaxandMin {
    //Define two methods to print the maximum and the minimum number respectively
    // among three numbers entered by the user.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number :");
        int a = sc.nextInt();
        System.out.print("Enter second number :");
        int b = sc.nextInt();
        System.out.print("Enter third number :");
        int c = sc.nextInt();
        sc.close();

        maximum(a,b,c);
        minimum(a,b,c);
    }
    static void maximum(int max,int num2,int num3){
        if(max < num2){
            max = num2;
        }else if(max < num3){
            max = num3;
        }
        System.out.println("Maximum of three number is :"+max);
    }

    static void minimum(int max,int num2,int num3){
        if(max > num2){
            max = num2;
        }else if(max > num3){
            max = num3;
        }
        System.out.println("Minimum of three number is :"+max);
    }
}
