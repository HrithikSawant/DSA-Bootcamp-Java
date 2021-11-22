package com.Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a'+'b');
        System.out.println("a"+"b");
        System.out.println((char)('a'+3));
        //this is same as after a few steps: "a" + "1"
        //Integer will be converted to Integer that will call toString()

        System.out.println("Hrithik" + new ArrayList<>());


    }
}
