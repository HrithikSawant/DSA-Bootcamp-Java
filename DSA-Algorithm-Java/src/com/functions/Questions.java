package com.functions;

import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(isPrime(n));
        int m = in.nextInt();
        System.out.println(isArmstrong(m));
        for (int i = 100; i < 1000 ; i++) {
            if(isArmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    //Q Check whether given number is prime or not
    static Boolean isPrime(int n){
        if(n <= 1){
            return false;
        }
        int c = 2;
        while (c * c <= n){
            if(n % c == 0) {
                return false;
            }
            c++;
        }
        if(c * c > n){
            return true;
        }
        return false;
    }

    //Q print all the 3 digits armstrong number
    static boolean isArmstrong(int n){
        int orignal = n;
        int sum = 0;

        while (n >0){
            int rem = n % 10;
            n = n / 10;
            sum = sum + rem*rem*rem;
        }
        if(sum==orignal){
            return true;
        }
        return false;
    }
}
