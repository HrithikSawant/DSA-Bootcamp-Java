package com.Strings;

import java.sql.SQLOutput;

public class Comparision {
    public static void main(String[] args) {
        String a = "Hrithik";
        String b = "Hrithik";

        System.out.println(a==b);

        String name1 = new String("Hrithik");
        String name2 = new String("Hrithik");

        //Comparitor
        System.out.println(name1==name2);

        //Method .equal
        System.out.println(name1.equals(name2));

    }
}
