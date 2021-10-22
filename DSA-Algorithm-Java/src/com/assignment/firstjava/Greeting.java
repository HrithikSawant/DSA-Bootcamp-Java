package com.assignment.firstjava;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your Name :");
        String name = in.nextLine();
        in.close();
        String greetMessage = "Hello, "+name+" Welcome to Java DSA-Bootcamp!!";
        System.out.println(greetMessage);

    }
}
