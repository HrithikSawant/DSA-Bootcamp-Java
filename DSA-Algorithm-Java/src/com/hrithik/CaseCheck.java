package com.hrithik;

import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter char : ");
        int ch = sc.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("LowerCase");
        } else {
            System.out.println("UpperCase");
        }
        System.out.println(ch);
    }
}
