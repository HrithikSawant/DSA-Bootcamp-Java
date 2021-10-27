package com.switchcase;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String fruit = sc.next();
        /*
        Syntax :
        switch (expression) {
            case one:
                //body;
                break;
            case two:
                //body;
                break;
            default:
                //body;
         */


        switch (fruit){
            case "Apple":
                System.out.println("An apple a day keeps a doctor away");
                break;
            case "Mango":
                System.out.println("King of fruit");
                break;
            case "Orange":
                System.out.println("Round fruit");
                break;
            case "Grape":
                System.out.println("small fruit");
                break;
            default:
                System.out.println("Please enter valid fruit");
        }
    }
}
