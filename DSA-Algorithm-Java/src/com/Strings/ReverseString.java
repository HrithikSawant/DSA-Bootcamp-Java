package com.Strings;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println("To reverse a string, enter something. ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Method 1 : "+reverse(str));
        System.out.println("Method 2 : "+reverse1(str));
    }

    //Method 1
    public static String reverse(String str){
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            char ch = str.charAt(i);
            reversedString.append(ch);
        }
        return reversedString.toString();
    }
    //Method 2
    public static String reverse1(String str){
        StringBuffer bf = new StringBuffer(str);
        return bf.reverse().toString();
    }

}
