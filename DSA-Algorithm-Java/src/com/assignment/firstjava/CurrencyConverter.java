package com.assignment.firstjava;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Amount in Rupees");
        float Rupees = sc.nextFloat();

        // one dollar = 75.45
        float USD = Rupees / 75.45f;

        System.out.println(Rupees+"Rs is "+USD+"$");

    }
}
