package com.hrithik;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        //Q Find the nth Fibonacci Number

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter nth Fibonacci number :");
        int n = sc.nextInt();
        int p = 0;
        int i = 1;
        int count = 2;

        if(n == 0){
            i = 0;
        }else {
            while(count<=n){
                int temp = i;
                i = i + p;
                p = temp;
                count ++;
            }
        }

        System.out.println(i);
    }
}
