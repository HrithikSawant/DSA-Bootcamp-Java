package com.arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

//        int[] arr = new int[4];
//        arr[0] = 12;
//        arr[1] = 21;
//        arr[2] = 32;
//        arr[3] = 21;
//        System.out.println(arr[2]);
//
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
//
//        System.out.println(Arrays.toString(arr));

        //Array of an object
        String[] str = new String[4];
        for (int i = 0; i < str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));
    }
}
