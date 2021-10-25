package com.hrithik;

import java.util.Scanner;

public class LargestNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();


        //Q. Find the largest number of the 3 number
        //Assuming a is greater
        int max = a;
        if(b > max){
            max = b;
        }
        if(c > max){
            max = c;
        }

//        Another way
//        int max = Math.max(a,Math.max(a,b));

        System.out.println(max);
    }
}
