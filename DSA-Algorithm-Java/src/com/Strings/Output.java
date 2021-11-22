package com.Strings;

public class Output {
    public static void main(String[] args) {
        //System is a Class
        //out is a reference variable of type PrintStream
        //PrintStream has a method println
        //println calls toString method
        System.out.println(56);
        System.out.println("Hrithik");

        //Println taking an object
        // checks if object is null or not if null return null
        // return .toString it will show default representation Random value(random char + add @ + hashcode)
        System.out.println(new int[]{2,3,4,5,6});
    }
}
