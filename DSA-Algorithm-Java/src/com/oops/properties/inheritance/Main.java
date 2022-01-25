package com.oops.properties.inheritance;

public class Main {
    public static void main(String[] args) {
//        Box box = new Box(4.6,7.9,9.9);
//        Box box1 = new Box(box);
//        System.out.println(box.l + " " + box.w + " " + box.h);

        BoxWeight box3 = new BoxWeight(1,2,3,4);
        BoxWeight box4 = new BoxWeight();

        System.out.println(box3.h + " " + box3.weight);


        Box box5 = new BoxWeight(1,2,3,4);
//        System.out.println(box5.h + " " + box5.weight);
    }
}
