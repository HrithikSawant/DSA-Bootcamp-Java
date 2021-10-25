package com.hrithik;

import java.util.Scanner;

public class CountNums {
    public static void main(String[] args) {

        int num = 1888457788;
        int count = 0;

        while (num > 0){
            int rem = num % 10;
            if(rem == 8){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}
