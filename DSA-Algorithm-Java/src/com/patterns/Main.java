package com.patterns;

public class Main {
    public static void main(String[] args) {
        pattern1(5);
        pattern2(4);
        pattern3(4);
        pattern4(5);
    }
    public static void pattern1(int n){
        for(int row = 1; row <= n ;row++){
            //for every row, run the col
            for (int col = 1; col <= n ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline;
            System.out.println();
        }
    }
    public static void pattern2(int n){
        for(int row = 1; row <= n ;row++){
            //for every row, run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline;
            System.out.println();
        }
    }
    public static void pattern3(int n){

        for(int row = 1; row <= n ;row++){
            //for every row, run the col
            for (int col = 1; col <= n-row+1 ; col++) {
                System.out.print("* ");
            }
            //when one row is printed, we need to add a newline;
            System.out.println();
        }
    }
    public static void pattern4(int n){
        for(int row = 1; row <= n ;row++){
            //for every row, run the col
            for (int col = 1; col <= row ; col++) {
                System.out.print(col+" ");
            }
            //when one row is printed, we need to add a newline;
            System.out.println();
        }
    }
}
