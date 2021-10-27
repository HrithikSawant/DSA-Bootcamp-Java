package com.functions;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
       sum();
      int ans = sum2();
      System.out.println("The sum = "+ans);

        System.out.println("----------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter Secound number: ");
        int b = sc.nextInt();
        ans = sum3(a,b);
        System.out.println("The sum = "+ans);
    }
    /*
     access modifier return_type name () {
        //body
        return statement;
     }
     */
    static void sum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Secound number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum = "+sum);
    }

    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter Secound number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static int sum3(int a,int b){
        int sum = a +b;
        return sum;
    }

}
